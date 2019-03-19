package kr.co.cz.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.cz.vo.ItemVO;

@Repository
public class ListDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public List<ItemVO> list(String case_of) {
		return mybatis.selectList("mapper.list_sql.SELECT_LIST", case_of);
	}
	public ItemVO view(String seq) {
		return mybatis.selectOne("mapper.list_sql.SELECT_VIEW", seq);
	}
}
