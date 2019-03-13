package kr.co.hyh.dao;

import java.util.HashMap;
import java.util.Map;

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
	
	public Map<String, Object> usercheck(String uid) {
		int count = 0;
        Map<String, Object> data = new HashMap<String, Object>();
		
        count = mybatis.selectOne("mapper.sql_member.SELECT_UID_COUNT", uid);
        data.put("result",count);
        
		return data;
	}
	
	public MemberVO login(MemberVO vo) {
		return mybatis.selectOne("mapper.sql_member.SELECT_LOGIN", vo);
	}

}
