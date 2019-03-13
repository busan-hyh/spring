package kr.co.hyh.service;

import java.util.List;

import kr.co.hyh.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> list(int start);
	public void view();
	public void write(BoardVO vo);
	
	public int getLimitStart(String pg);
	public int getTotal();
	public int getPageEnd(int total);
	public int[] getPageGroupStartEnd(String pg, int pgEnd);
}
