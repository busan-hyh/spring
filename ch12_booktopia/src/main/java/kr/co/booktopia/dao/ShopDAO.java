package kr.co.booktopia.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.booktopia.vo.ListVO;

@Repository
public class ShopDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public List<ListVO> list(String sort) {
		return null;
	}
	public ListVO view(String goods_id) {
		return mybatis.selectOne("mapper.shop_sql.SELECT_VIEW", goods_id);
	}
}
