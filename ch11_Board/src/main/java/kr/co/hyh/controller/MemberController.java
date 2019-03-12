package kr.co.hyh.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.hyh.service.MemberService;
import kr.co.hyh.vo.MemberVO;
import kr.co.hyh.vo.TermsVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;

	@RequestMapping(value="/login")
	public String login() {
		return "/member/login";
	}
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register() {
		return "/member/register";
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(MemberVO vo, HttpServletRequest req) {
		// ip는 리퀘스트로 받아오기...
		vo.setRegip(req.getRemoteAddr());
		service.register(vo);
		
		return "redirect:/list";
	}
	@RequestMapping(value="/terms")
	public String terms(Model model) {
		TermsVO vo = service.terms();
		model.addAttribute("termsVo", vo);
		
		return "/member/terms";
	}
}
