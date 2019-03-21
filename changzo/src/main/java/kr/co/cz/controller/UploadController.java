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
	public String register(HttpSession sess) {
		
		if(sess.getAttribute("user") != null) {
			// ȸ���̸�
			UserVO user = (UserVO) sess.getAttribute("user");
			String uid = user.getUid();
			if(uid.equals("changzo")) {
				// id�� changzo��
				return "/upload/register";
			}
			return "redirect:/";
		} else {
			return "/login";
		}
		
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(UserVO vo) {
		service.register(vo);
		return "redirect:/login";
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.GET)
	public String upload(HttpSession sess, Model model) {
		if(sess.getAttribute("user") != null) {
			UserVO user = (UserVO) sess.getAttribute("user");
			model.addAttribute("name", user.getName());
			model.addAttribute("hp", user.getHp());
			
			return "/upload/upload";
		} else {
			return "/login";
		}
		
	}
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String upload(ItemVO vo, HttpSession sess) {
		UserVO user = (UserVO) sess.getAttribute("user");
		
		vo.setIng("1");
		vo.setUid(user.getUid());
		service.upload(vo);
		
		return "redirect:/";
	}
	
	// modify view�� ListController�� ����
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(String seq, ItemVO vo) {
		
		vo.setSeq(seq);
		
		service.modify(vo);
		
		return "redirect:/mylist";
	}
}
