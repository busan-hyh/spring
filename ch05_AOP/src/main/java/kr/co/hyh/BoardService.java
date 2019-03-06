package kr.co.hyh;

import org.springframework.stereotype.Component;

@Component
public class BoardService {

	public void insert() {
		// <aop:before>
		System.out.println("글쓰기");
		// <aop:after>
	}
	
	public void select() {
		System.out.println("글보기");
	}
	public void update() {
		System.out.println("수정하기");
	}
	public void delete() {
		System.out.println("삭제");
	}
}
