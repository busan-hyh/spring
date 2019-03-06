package kr.co.hyh;

import org.springframework.stereotype.Component;

// AOP, 자동으로 실행되야 하는 것
@Component
public class LogAdvice {
	public void beforeLog() {
		System.out.println("=======================");
	}
	public void afterLog() {
		System.out.println("-----------------------");
	}
}
