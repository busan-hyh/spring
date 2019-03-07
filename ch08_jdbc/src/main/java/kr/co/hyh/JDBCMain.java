package kr.co.hyh;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class JDBCMain {
	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		UserService us = (UserService) ctx.getBean("userServiceImpl");
		
//		UserVO vo = new UserVO();
//		vo.setUid("nnewuser");
//		vo.setName("뉴뉴유저");
//		vo.setHp("66");
//		vo.setAddr("주소");
//		vo.setPos("팀장");
//		vo.setDep(103);
//		
//		us.insertUser(vo);
		
		List<UserVO> list = us.selectUserList();
		for(UserVO v : list) {
			System.out.println(v.getName());
		}
		
		UserVO userOne = us.selectUserOne("abc");
		System.out.println(userOne.getAddr());
		
		us.updateUser();
		
		us.deleteUser();
	}
}
