package kr.co.hyh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVMain {

	public static void main(String[] args) {
		//spring-context.xml 설정 불러오기
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		// xml에 설정된 아이디 객체 불러오기
		TV stv = (SamsungTV) ctx.getBean("samsungTV");
		TV ltv = (LgTV) ctx.getBean("ltv");
		
		stv.power();
		ltv.chDown();
		stv.soundUp();
		ltv.disconnect();
	}

}
