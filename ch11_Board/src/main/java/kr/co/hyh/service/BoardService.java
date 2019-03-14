package kr.co.hyh.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import kr.co.hyh.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> list(int start);
	public BoardVO view(String seq);
	public List<BoardVO> viewcomment(String seq);
	public void write(BoardVO vo);
	public int fileUpload(HttpServletRequest req, MultipartFile fName, int fParent);
	
	public int getLimitStart(String pg);
	public int getTotal();
	public int getPageEnd(int total);
	public int[] getPageGroupStartEnd(String pg, int pgEnd);
	
	public void delete(String seq);
}
