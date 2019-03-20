package kr.co.cz.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.cz.service.UploadService;
import kr.co.cz.vo.ItemVO;
import kr.co.cz.vo.UserVO;

@Controller
public class UploadController {

	@Inject
	private UploadService service;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register() {
		return "/upload/register";
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(UserVO vo) {
		service.register(vo);
		return "redirect:/login";
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.GET)
	public String upload(HttpSession sess, Model model) {
		UserVO user = (UserVO) sess.getAttribute("user");
		model.addAttribute("name", user.getName());
		model.addAttribute("hp", user.getHp());
		
		return "/upload/upload";
	}
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String upload(ItemVO vo, HttpSession sess) {
		UserVO user = (UserVO) sess.getAttribute("user");
		
		vo.setIng("1");
		vo.setUid(user.getUid());
		service.upload(vo);
		
		return "redirect:/";
	}
	
	// modify view는 ListController에 있음
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(String seq, HttpSession sess, ItemVO vo) {
		UserVO user = (UserVO) sess.getAttribute("user");
		
		return "redirect:/mylist";
	}
}
