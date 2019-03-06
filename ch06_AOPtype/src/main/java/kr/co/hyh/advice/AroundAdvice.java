package kr.co.hyh.advice;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AroundAdvice {
	public void around1(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around Advice 1-1");
		// 포인트컷을 ▼여기에 실행한다는 뜻
		pjp.proceed();
		System.out.println("Around Advice 1-2");
	}
	public void around2() {
		System.out.println("Around Advice 2");
	}
	public void around3() {
		System.out.println("Around Advice 3");
	}
}
