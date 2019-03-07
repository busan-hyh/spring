package kr.co.hyh;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// 어노테이션 기반 AOP처리-aspect ref="logAdvice" 선언
@Aspect
@Component
public class LogAdvice {
	
	// 포인트컷 선언
	@Pointcut("execution(* kr.co.hyh.BoardService.insert(..))")
	public void insertPointcut() {} // 내용이 없는 이름지정용 참조 메서드 선언
	
	@Pointcut("execution(* kr.co.hyh.BoardService.select(..))")
	public void selectPointcut() {}
	
	@Pointcut("execution(* kr.co.hyh.BoardService.update(..))")
	public void updatePointcut() {}
	
	// 모든 메서드 실행될때를 위한 allPointcut
	@Pointcut("execution(* kr.co.hyh.BoardService.*(..))")
	public void allPointcut() {}
	
	// beforeAdvice가 실행될 포인트컷 지정
	@Before("insertPointcut()")
	public void beforeAdvice() {
		System.out.println("beforeAdvice...");
	}
	
	// 두군데 포인트컷에 실행되도록
	@After("insertPointcut() || selectPointcut()")
	public void afterAdvice() {
		System.out.println("afterAdvice...");
	}
	
	@AfterReturning("selectPointcut()")
	public void afterReturnAdvice() {
		System.out.println("afterReturnAdvice...");
	}
	
	@Around("updatePointcut()")
	public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundAdvice...header");
		pjp.proceed();
		System.out.println("aroundAdvice...footer");
	}
}
