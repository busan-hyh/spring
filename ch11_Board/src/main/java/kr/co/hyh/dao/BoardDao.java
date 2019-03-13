package kr.co.hyh.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hyh.vo.BoardVO;

@Repository
public class BoardDao {

	@Inject
	private SqlSessionTemplate mybatis;
	
	public List<BoardVO> list(int start) {
		return mybatis.selectList("mapper.sql_board.SELECT_LIST", start);
	}
	public void view() {
		
	}
	public void write(BoardVO vo) {
		mybatis.insert("mapper.sql_board.INSERT_BOARD", vo);
	}
	public int getTotal() {
		return mybatis.selectOne("mapper.sql_board.SELECT_TOTAL");
	}
}
