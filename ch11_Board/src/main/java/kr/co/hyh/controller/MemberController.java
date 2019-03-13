package kr.co.hyh.controller;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.hyh.service.MemberService;
import kr.co.hyh.vo.MemberVO;
import kr.co.hyh.vo.TermsVO;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "/member/login";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(HttpSession sess, MemberVO vo) {
		// vo�� �Ⱦ��� �Ű��������� String uid, String pass�� �ᵵ ��(���⾲)
		MemberVO member = service.login(vo);
		
		if(member != null) {
			// ���� ����
			sess.setAttribute("member", member);
			
			return "redirect:/list";
		}else {
			
			return "redirect:/login?result=fail";	
		}
	}
	
	@RequestMapping(value="/terms")
	public String terms(Model model) {
		TermsVO vo = service.terms();
		
		model.addAttribute("termsVo", vo);
		
		return "/member/terms";
	}
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register() {
		return "/member/register";
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(MemberVO vo, HttpServletRequest req) {
		// ip�� ������Ʈ�� �޾ƿ���...
		vo.setRegip(req.getRemoteAddr());
		service.register(vo);
		
		return "redirect:/login";
	}
	@RequestMapping(value="/usercheck", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> usercheck(@RequestParam("uid") String uid) {
		//ResponseBody�� ���� pom�� jackson-databind ��ġ
		Map<String, Object> data = service.usercheck(uid);

		return data;
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession sess) {
		sess.invalidate();
		return "redirect:/list";
	}
	
}
