package kr.co.cz.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.cz.service.ListService;
import kr.co.cz.vo.ItemVO;
import kr.co.cz.vo.UserVO;

@Controller
public class ListController {

	@Inject
	private ListService service;
	
	@RequestMapping(value="/list")
	public String list(@RequestParam String case_of, Model model, HttpSession sess) {
		if(sess.getAttribute("user") != null) {
			List<ItemVO> list = service.list(case_of);
			model.addAttribute("list", list);
			model.addAttribute("key", case_of);
			
			return "/list/list";
		} else {
			return "/login";
		}
	}
	
	@RequestMapping(value="/mylist")
	public String mylist(HttpSession sess, Model model) {
		if(sess.getAttribute("user") != null) {
			UserVO user = (UserVO) sess.getAttribute("user");
			String uid = user.getUid();
			
			List<ItemVO> mylist = service.mylist(uid);
			model.addAttribute("mylist", mylist);
			model.addAttribute("uid", uid);
			model.addAttribute("grade", user.getGrade());
			
			return "/list/mylist";
		} else {
			return "/login";
		}
	}
	
	@RequestMapping(value="/view")
	public String view(@RequestParam String seq, Model model, HttpSession sess) {
		if(sess.getAttribute("user") != null) {
			UserVO user = (UserVO) sess.getAttribute("user");
			model.addAttribute("uid", user.getUid());
			
			ItemVO vo = service.view(seq);
			model.addAttribute("view", vo);
			return "/list/view";
		} else {
			return "/login";
		}
	}
	
	@RequestMapping(value="/guSearch")
	public String guSearch(@RequestParam String case_of, String kind_of, String gu, Model model) {
		
		List<ItemVO> list = service.guSearch(case_of, kind_of, gu);

		model.addAttribute("list", list);
		model.addAttribute("key", case_of);
		
		return "/list/list";
	}
	
	@RequestMapping(value="/mySearch")
	public String mySearch(@RequestParam String case_of, String kind_of, String gu, HttpSession sess, Model model) {
		UserVO user = (UserVO) sess.getAttribute("user");
		String uid = user.getUid();
		
		List<ItemVO> mylist = service.mySearch(case_of, kind_of, gu, uid);
		model.addAttribute("mylist", mylist);
		
		return "/list/mylist";
	}
	
	// modify upload는 UploadController에 있음
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String modify(@RequestParam String seq, Model model, HttpSession sess) {
		if(sess.getAttribute("user") != null) {
			// uid==uid 체크
			UserVO user = (UserVO) sess.getAttribute("user");
			
			ItemVO vo = service.view(seq);
			
			if(vo.getUid().equals(user.getUid())) {
				model.addAttribute("view", vo);
				
				return "/upload/modify";
			} else {
				return "redirect:/";
			}
		} else {
			return "/login";
		}
	}
}
