package kr.co.hyh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVMain {

	public static void main(String[] args) {
		//spring-context.xml ���� �ҷ�����
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		// xml�� ������ ���̵� ��ü �ҷ�����
		TV stv = (SamsungTV) ctx.getBean("samsungTV");
		TV ltv = (LgTV) ctx.getBean("ltv");
		
		stv.power();
		ltv.chDown();
		stv.soundUp();
		ltv.disconnect();
	}

}
