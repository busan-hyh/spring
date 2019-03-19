package kr.co.ch08;

import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Inject
	private JdbcTemplate jdbc;
	
	private String sql_insert = "INSERT INTO USER SET uid=?, name=?, hp=?, addr=?, pos=?, dep=?, rdate=NOW()";
	private String sql_select_list = "SELECT * FROM USER";
	private String sql_select_one  = "SELECT * FROM USER WHERE uid=?";
	
	
	public void insertUser(UserVO vo) {
		Object[] values = {vo.getUid(), vo.getName(), vo.getHp(), vo.getAddr(), vo.getPos(), vo.getDep()};
		jdbc.update(sql_insert, values);
	}

	public List<UserVO> selectUserList() {
		return jdbc.query(sql_select_list, new UserRowMapper());
	}
	
	public UserVO selectUserOne(String uid) {
		Object[] values = {uid};
		return jdbc.queryForObject(sql_select_one, values, new UserRowMapper());
	}

	public void updateUser() {
		System.out.println("update!!!");
	}

	public void deleteUser() {
		System.out.println("delete!!!");
	}
	
}
