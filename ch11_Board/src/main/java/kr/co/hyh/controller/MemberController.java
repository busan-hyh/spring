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
		// vo를 안쓰고 매개변수에서 String uid, String pass를 써도 됨(복잡쓰)
		MemberVO member = service.login(vo);
		
		if(member != null) {
			// 세션 저장
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
		// ip는 리퀘스트로 받아오기...
		vo.setRegip(req.getRemoteAddr());
		service.register(vo);
		
		return "redirect:/login";
	}
	@RequestMapping(value="/usercheck", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> usercheck(@RequestParam("uid") String uid) {
		//ResponseBody를 위해 pom에 jackson-databind 설치
		Map<String, Object> data = service.usercheck(uid);

		return data;
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession sess) {
		sess.invalidate();
		return "redirect:/list";
	}
	
}
