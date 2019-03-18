package kr.co.booktopia.service;

import java.util.List;

import kr.co.booktopia.vo.ListVO;

public interface ShopService {
	public List<ListVO> list(String sort);
	public ListVO view(String goods_id);
}
