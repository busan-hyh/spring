package kr.co.hyh;

import org.springframework.stereotype.Component;

@Component
public class BoardService {

	public void insert() {
		// <aop:before>
		System.out.println("�۾���");
		// <aop:after>
	}
	
	public void select() {
		System.out.println("�ۺ���");
	}
	public void update() {
		System.out.println("�����ϱ�");
	}
	public void delete() {
		System.out.println("����");
	}
}
