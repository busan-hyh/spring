package kr.co.cz.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.cz.service.MainService;
import kr.co.cz.vo.UserVO;

@Controller
public class MainController {

	@Inject
	private MainService service;
	
	@RequestMapping(value= {"","/", "/index"}, method=RequestMethod.GET)
	public String index(HttpSession sess) {
		UserVO user = (UserVO) sess.getAttribute("user");
		if(user != null) {
			return "/index";
		} else {
			return "/login";
		}
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(HttpSession sess) {
		UserVO user = (UserVO) sess.getAttribute("user");
		if(user != null) {
			return "redirect:/";
		} else {
			return "/login";
		}
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(UserVO vo, HttpSession sess) {
		UserVO user = service.login(vo);
		
		if(user != null) {
			sess.setAttribute("user", user);
			service.loginDate(vo);
			return "redirect:/";
		} else {
			return "/login";
		}
		
		
	}
}
