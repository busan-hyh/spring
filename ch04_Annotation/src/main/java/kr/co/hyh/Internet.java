package kr.co.hyh;

import org.springframework.stereotype.Component;

@Component
public class Internet {
	public void connect() {
		System.out.println("인터넷 접속");
	}
	public void disconnect() {
		System.out.println("인터넷 접속 해제");
	}
}
