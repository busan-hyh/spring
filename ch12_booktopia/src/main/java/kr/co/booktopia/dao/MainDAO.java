package kr.co.booktopia.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.booktopia.vo.ListVO;

@Repository
public class MainDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public List<ListVO> indexBestseller() {
		return mybatis.selectList("mapper.main_sql.SELECT_BESTSELLER");
	}
	public List<ListVO> indexNewbook() {
		return mybatis.selectList("mapper.main_sql.SELECT_NEW");
	}
	public List<ListVO> indexSteadyseller() {
		return mybatis.selectList("mapper.main_sql.SELECT_STEADYSELLER");
	}
}
