package kr.co.hyh.dao;

import java.util.List;
import java.util.Map;

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
		mybatis.update("mapper.sql_board.UPDATE_VIEW", seq);
		return mybatis.selectOne("mapper.sql_board.SELECT_VIEW", seq);
	}
	public FileVO fileView(String seq) {
		return mybatis.selectOne("mapper.sql_board.SELECT_FILE", seq);
	}
	public List<BoardVO> viewcomment(String seq) {
		return mybatis.selectList("mapper.sql_board.SELECT_COMMENT", seq);
	}
	public int write(BoardVO vo) {
		mybatis.insert("mapper.sql_board.INSERT_BOARD", vo);
		return vo.getSeq();
	}
	public void fileWrite(FileVO vo) {
		mybatis.insert("mapper.sql_board.INSERT_FILE_WRITE", vo);
	}
	public void fileUpdate(String parent) {
		mybatis.update("mapper.sql_board.UPDATE_FILE_DOWNLOAD", parent);
	}
	public int getTotal() {
		return mybatis.selectOne("mapper.sql_board.SELECT_TOTAL");
	}
	public void delete(String seq) {
		mybatis.delete("mapper.sql_board.DELETE_LIST", seq);
	}
	public void writecomment(Map<String, Object> comment) {
		mybatis.insert("mapper.sql_board.INSERT_COMM", comment);
		mybatis.update("mapper.sql_board.UPDATE_COMM", comment);
	}
}
