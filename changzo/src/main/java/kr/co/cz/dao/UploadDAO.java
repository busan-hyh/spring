package kr.co.cz.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.cz.vo.ItemVO;
import kr.co.cz.vo.UserVO;

@Repository
public class UploadDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public void register(UserVO vo) {
		mybatis.insert("mapper.upload_sql.INSERT_USER", vo);
	}
	
	public void upload(ItemVO vo) {
		mybatis.insert("mapper.upload_sql.INSERT_ITEM", vo);
	}
	
	public List<ItemVO> modify(String seq) {
		return null;
	}
}
