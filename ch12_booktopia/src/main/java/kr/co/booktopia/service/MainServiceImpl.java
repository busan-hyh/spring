package kr.co.booktopia.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.booktopia.dao.MainDAO;
import kr.co.booktopia.vo.ListVO;

@Service
public class MainServiceImpl implements MainService {

	@Inject
	private MainDAO dao;
	
	@Override
	public Map<String, List<ListVO>> listGoods() {
		
		Map<String, List<ListVO>> goodsMap = new HashMap<String, List<ListVO>>();
		
		List<ListVO> goodsList = dao.selectGoodsList("bestseller");
		goodsMap.put("bestseller", goodsList);
		
		goodsList = dao.selectGoodsList("newbook");
		goodsMap.put("newbook", goodsList);
		
		goodsList = dao.selectGoodsList("steadyseller");
		goodsMap.put("steadyseller", goodsList);
		
		return goodsMap;
	}

}
