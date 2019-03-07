package kr.co.hyh;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//select * list를 담을 result set 을 구현
public class UserRowMapper implements RowMapper<UserVO> {

	@Override
	public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UserVO vo = new UserVO();
		vo.setSeq(rs.getInt(1));
		vo.setUid(rs.getString(2));
		vo.setName(rs.getString(3));
		vo.setHp(rs.getString(4));
		vo.setAddr(rs.getString(5));
		vo.setPos(rs.getString(6));
		vo.setDep(rs.getInt(7));
		vo.setRdate(rs.getString(8));
		
		return vo;
	}
	
	
}
