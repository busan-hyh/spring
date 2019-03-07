package kr.co.hyh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AOPMain {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService) ctx.getBean("boardService");
		
		System.out.println("=======================");
		bs.insert();
		System.out.println("=======================");
		bs.select();
		System.out.println("=======================");
		bs.update();
		System.out.println("=======================");
		bs.delete();
		System.out.println("=======================");
	}
}
