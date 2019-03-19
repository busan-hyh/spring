package kr.co.ch08;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

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
