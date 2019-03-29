package kr.co.cz.dao;

import java.util.HashMap;
import java.util.Map;

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
	
	public void modify(ItemVO vo) {
		mybatis.update("mapper.upload_sql.UPDATE_ITEM", vo);
	}
	
	public Map<String, Object> usercheck(String uid) {
		int count = 0;
        Map<String, Object> data = new HashMap<String, Object>();
		
        count = mybatis.selectOne("mapper.upload_sql.SELECT_UID_COUNT", uid);
        data.put("result",count);
        
		return data;
	}
	
	public void regimodi(UserVO vo) {
		mybatis.update("mapper.upload_sql.UPDATE_REGI", vo);
	}

}
