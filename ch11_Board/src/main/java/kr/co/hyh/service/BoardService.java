package kr.co.hyh.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import kr.co.hyh.vo.BoardVO;
import kr.co.hyh.vo.FileVO;

public interface BoardService {

	public List<BoardVO> list(int start);
	public BoardVO view(String seq);
	public FileVO fileView(String seq);
	public List<BoardVO> viewcomment(String seq);
	public int write(BoardVO vo);
	public FileVO fileUpload(HttpServletRequest req, MultipartFile fName);
	public void fileUpdate(String parent);
	public void fileWrite(FileVO vo);
	public void writecomment(Map<String, Object> comment);
	
	public int getLimitStart(String pg);
	public int getTotal();
	public int getPageEnd(int total);
	public int[] getPageGroupStartEnd(String pg, int pgEnd);
	
	public void delete(String seq);
}
