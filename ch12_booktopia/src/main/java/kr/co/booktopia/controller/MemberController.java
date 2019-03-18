package kr.co.booktopia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping(value="/member/login")
	public String login() {
		return "/member/login";
	}
	@RequestMapping(value="/member/logout")
	public String logout() {
		return "redirect:/member/login";
	}
	@RequestMapping(value="/member/register")
	public String register() {
		return "/member/register";
	}
	@RequestMapping(value="/member/mypage")
	public String mypage() {
		return "/member/mypage";
	}
}
