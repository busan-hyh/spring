package kr.co.cz.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.cz.vo.UserVO;

@Repository
public class UploadDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public void register(UserVO vo) {
		mybatis.insert("mapper.upload_sql.INSERT_USER", vo);
	}
}
