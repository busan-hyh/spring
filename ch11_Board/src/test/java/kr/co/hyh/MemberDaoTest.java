package kr.co.hyh;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.hyh.dao.MemberDao;
import kr.co.hyh.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:springtest-context.xml"})
public class MemberDaoTest {
	
	@Inject
	private MemberDao dao;
	
	
	public void loginTest() {
		MemberVO vo = new MemberVO();
		vo.setUid("abcd");
		vo.setPass("1234");
		
		MemberVO user = dao.login(vo);
		
		System.out.println(user);
	}
	
	@Test
	public void registerTest() {
		MemberVO vo = new MemberVO();
		vo.setUid("a1234a");
		vo.setPass("1234");
		vo.setName("±æ¶Ë");
		vo.setHp("264-2398");
		vo.setNick("±æ¶Ë¾²");
		
		dao.register(vo);
		System.out.println("register Å×½ºÆ® ¿Ï·á");
	}
	
}
