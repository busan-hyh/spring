package kr.co.cz.controller;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
			// 회원이면
			UserVO user = (UserVO) sess.getAttribute("user");
			int grade = user.getGrade();
			if(grade == 2) {
				// grade가 2면
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
	
	@RequestMapping(value="/regimodi", method=RequestMethod.GET)
	public String regimodi(HttpSession sess, Model model) {
		if(sess.getAttribute("user") != null) {
			UserVO user = (UserVO) sess.getAttribute("user");
			model.addAttribute("user", user);
			
			return "/upload/regimodi";
		} else {
			return "redirect:/login";
		}
	}
	
	@RequestMapping(value="/regimodi", method=RequestMethod.POST)
	public String regimodi(UserVO vo) {
		service.regimodi(vo);
		
		return "redirect:/mylist";
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
		
		vo.setIng(1);
		vo.setUid(user.getUid());
		service.upload(vo);
		
		return "redirect:/";
	}
	
	// modify view는 ListController에 있음
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(ItemVO vo) {
		
		service.modify(vo);
		
		return "redirect:/mylist";
	}
	
	@RequestMapping(value="/usercheck", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> usercheck(@RequestParam("uid") String uid) {
		Map<String, Object> data = service.usercheck(uid);

		return data;
	}
}
