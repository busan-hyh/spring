package kr.co.hyh.advice;
import org.springframework.stereotype.Component;

@Component
public class BeforeAdvice {
	public void before1() {
		System.out.println("Before Advice 1");
	}
	public void before2() {
		System.out.println("Before Advice 2");
	}
	public void before3() {
		System.out.println("Before Advice 3");
	}
}
