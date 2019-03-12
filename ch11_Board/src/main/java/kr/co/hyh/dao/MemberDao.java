package kr.co.hyh.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hyh.vo.MemberVO;
import kr.co.hyh.vo.TermsVO;

@Repository
public class MemberDao {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public TermsVO terms() {
		return mybatis.selectOne("mapper.sql_member.SELECT_TURMS");
	}
	
	public void register(MemberVO vo) {
		mybatis.insert("mapper.sql_member.INSERT_MEMBER", vo);
	}
	public void login() {
		
	}

}
