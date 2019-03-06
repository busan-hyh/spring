package kr.co.hyh.advice;
import org.springframework.stereotype.Component;

@Component
public class AfterAdvice {
	public void after1() {
		System.out.println("After Advice 1");
	}
	public void after2() {
		System.out.println("After Advice 2");
	}
	public void after3() {
		System.out.println("After Advice 3");
	}
}
