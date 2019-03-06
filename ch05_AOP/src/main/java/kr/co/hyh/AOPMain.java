package kr.co.hyh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AOPMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService) ctx.getBean("boardService");
		
		bs.insert();
		bs.update();
		bs.select();
		bs.delete();
	}
}
