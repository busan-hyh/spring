package kr.co.hyh;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// ������̼� ��� AOPó��-aspect ref="logAdvice" ����
@Aspect
@Component
public class LogAdvice {
	
	// ����Ʈ�� ����
	@Pointcut("execution(* kr.co.hyh.BoardService.insert(..))")
	public void insertPointcut() {} // ������ ���� �̸������� ���� �޼��� ����
	
	@Pointcut("execution(* kr.co.hyh.BoardService.select(..))")
	public void selectPointcut() {}
	
	@Pointcut("execution(* kr.co.hyh.BoardService.update(..))")
	public void updatePointcut() {}
	
	// ��� �޼��� ����ɶ��� ���� allPointcut
	@Pointcut("execution(* kr.co.hyh.BoardService.*(..))")
	public void allPointcut() {}
	
	// beforeAdvice�� ����� ����Ʈ�� ����
	@Before("insertPointcut()")
	public void beforeAdvice() {
		System.out.println("beforeAdvice...");
	}
	
	// �α��� ����Ʈ�ƿ� ����ǵ���
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
