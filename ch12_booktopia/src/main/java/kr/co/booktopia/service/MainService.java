package kr.co.booktopia.service;

import java.util.List;

import kr.co.booktopia.vo.ListVO;

public interface MainService {
	public List<ListVO> indexBestseller();
	public List<ListVO> indexNewbook();
	public List<ListVO> indexSteadyseller();
}
