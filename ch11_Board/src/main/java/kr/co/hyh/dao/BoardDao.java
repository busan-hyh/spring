package kr.co.hyh.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hyh.vo.BoardVO;
import kr.co.hyh.vo.FileVO;

@Repository
public class BoardDao {

	@Inject
	private SqlSessionTemplate mybatis;
	
	public List<BoardVO> list(int start) {
		return mybatis.selectList("mapper.sql_board.SELECT_LIST", start);
	}
	public BoardVO view(String seq) {
		return mybatis.selectOne("mapper.sql_board.SELECT_VIEW", seq);
	}
	public List<BoardVO> viewcomment(String seq) {
		return mybatis.selectList("mapper.sql_board.SELECT_COMMENT", seq);
	}
	public void write(BoardVO vo) {
		mybatis.insert("mapper.sql_board.INSERT_BOARD", vo);
	}
	public void fileUpload(FileVO vo) {
		mybatis.insert("mapper.sql_board.INSERT_FILE", vo);
	}
	public int getTotal() {
		return mybatis.selectOne("mapper.sql_board.SELECT_TOTAL");
	}
	public void delete(String seq) {
		mybatis.delete("mapper.sql_board.DELETE_LIST", seq);
	}
}
