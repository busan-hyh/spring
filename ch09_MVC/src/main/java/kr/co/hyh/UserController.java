package kr.co.hyh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	// url/form���� ���� /user/form.jsp�� ��
	@RequestMapping("/form")
	public String form() {
		return "/user/form";
	}
	
	// �Ű������� �־��ָ� ����Ʈ��Ʈ�ѷ����� req��� model ���
	// �Ű������� String uid, String name, String hp, String ...�ϳ��ϳ� �ҷ����°� �ƴ϶� UserVO��ü�� ����
	@RequestMapping("/regist")
	public String regist(Model model, UserVO vo) {
		
		model.addAttribute(vo);
		
		return "/user/regist";
	}
}
