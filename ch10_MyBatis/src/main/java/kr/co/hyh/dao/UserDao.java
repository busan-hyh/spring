package kr.co.hyh.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hyh.vo.SQL;
import kr.co.hyh.vo.UserRowMapper;
import kr.co.hyh.vo.UserVO;

@Repository
public class UserDao {
	
//	@Inject
//	private JdbcTemplate jdbc;
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public void userInsert(UserVO vo) {
//		Object[] values = {vo.getUid(),vo.getName(),vo.getHp(),vo.getAddr(),vo.getPos(),vo.getDep()};
//		jdbc.update(SQL.insert, values);
		
		mybatis.insert("mapper.sql.INSERT_USER", vo);
	}
	
	public List<UserVO> userList() {
		
//		return jdbc.query(SQL.select_list, new UserRowMapper());
		
		return mybatis.selectList("mapper.sql.SELECT_USER_LIST");
	}
	
	public UserVO userView() {
		return mybatis.selectOne("mapper.sql.SELECT_USER_ONE");
	}
}
