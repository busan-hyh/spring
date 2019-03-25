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
	
	@RequestMapping(value= {"","/", "/index"})
	public String index() {
		return "/index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(HttpSession sess) {
		if(sess.getAttribute("user") != null) {
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
			return "redirect:/";
		} else {
			return "/login";
		}
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession sess) {
		sess.removeAttribute("user");
		return "/login";
		
	}
}
