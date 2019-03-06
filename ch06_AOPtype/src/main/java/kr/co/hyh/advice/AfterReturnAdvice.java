package kr.co.hyh.advice;
import org.springframework.stereotype.Component;

@Component
public class AfterReturnAdvice {
	public void afterReturn1() {
		System.out.println("After Return Advice 1");
	}
	public void afterReturn2() {
		System.out.println("After Return Advice 2");
	}
	public void afterReturn3() {
		System.out.println("After Return Advice 3");
	}
}
