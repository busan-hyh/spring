package kr.co.hyh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class IocTest {
	public static void main(String[] args) {
		
		// IoC ���� ������ �� : ���յ��� ����
		LgTV ltv = new LgTV();
		ltv.power();
		ltv.chDown();
		ltv.chUp();
		
		// �������� �������� ��(TV�������̽�) : ���յ��� ���� ����
		TV stv = new SamsungTV();
		stv.power();
		stv.chDown();
		stv.chUp();
		
		// IoC ������ ��ü����
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		// src/main/resources/spring-context.xml�� LGTV, SamsungTV�� ����
		SamsungTV getStv = (SamsungTV) ctx.getBean("stv");
		LgTV getLtv = (LgTV) ctx.getBean("ltv");
		
		getStv.power();
		getStv.chDown();
		getStv.chUp();
		
		getLtv.power();
		getLtv.chDown();
		getLtv.chUp();
		
		// �������� ������ ���� ���� xml��ϰ��� ��ü������ �̸� �Ǿ��ְ� �ű⼭ �̷��� �޾ƿͼ� ���� ��.
		
	}
}
