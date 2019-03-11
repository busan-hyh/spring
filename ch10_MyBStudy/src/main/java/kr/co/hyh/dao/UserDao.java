package kr.co.hyh.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hyh.vo.UserVO;

@Repository
public class UserDao {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public void userInsert(UserVO vo) {
		mybatis.insert("mapper.sql.INSERT_USER", vo);
	}
	public List<UserVO> userList() {
		return mybatis.selectList("mapper.sql.SELECT_USER_LIST");
	}
	public void userView() {
		
	}
}
