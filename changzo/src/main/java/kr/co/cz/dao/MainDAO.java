package kr.co.cz.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.cz.vo.UserVO;

@Repository
public class MainDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public UserVO login(UserVO vo) {
		return mybatis.selectOne("mapper.main_sql.SELECT_LOGIN", vo);
	}
	
	public void loginDate(UserVO vo) {
		mybatis.update("mapper.main_sql.UPDATE_LDATE", vo);
	}
}
