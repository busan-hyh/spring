package kr.co.booktopia.service;

import java.util.List;
import java.util.Map;

import kr.co.booktopia.vo.ListVO;

public interface MainService {
	public Map<String, List<ListVO>> listGoods();
}
