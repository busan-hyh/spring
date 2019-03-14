package kr.co.hyh;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;

import kr.co.hyh.dao.BoardDao;
import kr.co.hyh.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:springtest-context.xml"})
public class BoardDaoTest {
	
	@Inject
	private BoardDao dao;
	
	@Test
	public void view() {
		String seq = "3";
		List<BoardVO> comment = dao.viewcomment(seq);
		
		System.out.println(comment);
		
	}
	
}
