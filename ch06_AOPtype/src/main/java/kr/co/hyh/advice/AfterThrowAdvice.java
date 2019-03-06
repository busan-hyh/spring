package kr.co.hyh.advice;
import org.springframework.stereotype.Component;

@Component
public class AfterThrowAdvice {
	public void afterThrow1() {
		System.out.println("After Throw Advice 1");
	}
	public void afterThrow2() {
		System.out.println("After Throw Advice 2");
	}
	public void afterThrow3() {
		System.out.println("After Throw Advice 3");
	}
}
