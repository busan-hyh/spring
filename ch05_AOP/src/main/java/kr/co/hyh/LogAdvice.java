package kr.co.hyh;

import org.springframework.stereotype.Component;

// AOP, �ڵ����� ����Ǿ� �ϴ� ��
@Component
public class LogAdvice {
	public void beforeLog() {
		System.out.println("=======================");
	}
	public void afterLog() {
		System.out.println("-----------------------");
	}
}
