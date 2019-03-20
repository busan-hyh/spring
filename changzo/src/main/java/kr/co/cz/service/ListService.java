package kr.co.cz.service;

import java.util.List;

import kr.co.cz.vo.ItemVO;

public interface ListService {
	public List<ItemVO> list(String case_of);
	public List<ItemVO> guSerch(String case_of, String gu);
	public ItemVO view(String seq);
}
