package kr.co.hyh;

import org.springframework.stereotype.Component;

@Component
public class Internet {
	public void connect() {
		System.out.println("���ͳ� ����");
	}
	public void disconnect() {
		System.out.println("���ͳ� ���� ����");
	}
}
