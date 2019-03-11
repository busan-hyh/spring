package kr.co.hyh;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.hyh.service.UserService;
import kr.co.hyh.vo.UserVO;

@Controller
public class UserController {
	
	@Inject
	private UserService service;
	
	@RequestMapping(value="/userinsert", method=RequestMethod.GET)
	public String userInsert() {
		return "/userinsert";
	}
	@RequestMapping(value="/userinsert", method=RequestMethod.POST)
	public String userInsert(UserVO vo) {
		service.userInsert(vo);
		
		// 리다이렉트
		return "redirect:/userlist";
	}
	
	@RequestMapping(value="/userlist")
	public String userList(Model model) {
		
		List<UserVO> userList = service.userList();
		model.addAttribute("userList", userList);
		
		return "/userlist";
	}
	
	@RequestMapping(value="/userview")
	public String userView() {
		return "/userview";
	}
}
