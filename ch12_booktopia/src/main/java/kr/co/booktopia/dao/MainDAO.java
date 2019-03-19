package kr.co.booktopia.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.booktopia.vo.ListVO;

@Repository
public class MainDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public List<ListVO> selectGoodsList(String goodsStatus) {
		return mybatis.selectList("mapper.main_sql.SELECT_GOODSLIST", goodsStatus);
	}
}
