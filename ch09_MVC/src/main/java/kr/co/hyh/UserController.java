package kr.co.hyh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	// url/form으로 들어가면 /user/form.jsp가 뜸
	@RequestMapping("/form")
	public String form() {
		return "/user/form";
	}
	
	// 매개변수로 넣어주면 프론트컨트롤러에서 req대신 model 사용
	// 매개변수에 String uid, String name, String hp, String ...하나하나 불러오는게 아니라 UserVO객체를 쓴다
	@RequestMapping("/regist")
	public String regist(Model model, UserVO vo) {
		
		model.addAttribute(vo);
		
		return "/user/regist";
	}
}
