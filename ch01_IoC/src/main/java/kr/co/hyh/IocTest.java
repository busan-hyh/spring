package kr.co.hyh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class IocTest {
	public static void main(String[] args) {
		
		// IoC 적용 안했을 때 : 결합도가 높다
		LgTV ltv = new LgTV();
		ltv.power();
		ltv.chDown();
		ltv.chUp();
		
		// 다형성을 적용했을 때(TV인터페이스) : 결합도가 조금 낮다
		TV stv = new SamsungTV();
		stv.power();
		stv.chDown();
		stv.chUp();
		
		// IoC 적용한 객체주입
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		// src/main/resources/spring-context.xml에 LGTV, SamsungTV를 주입
		SamsungTV getStv = (SamsungTV) ctx.getBean("stv");
		LgTV getLtv = (LgTV) ctx.getBean("ltv");
		
		getStv.power();
		getStv.chDown();
		getStv.chUp();
		
		getLtv.power();
		getLtv.chDown();
		getLtv.chUp();
		
		// 스프링을 쓸때는 위와 같은 xml등록같은 객체주입이 미리 되어있고 거기서 이렇게 받아와서 쓰는 것.
		
	}
}
