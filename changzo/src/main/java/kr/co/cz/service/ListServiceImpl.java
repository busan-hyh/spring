package kr.co.cz.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.cz.dao.ListDAO;
import kr.co.cz.vo.ItemVO;

@Service
public class ListServiceImpl implements ListService {

	@Inject
	private ListDAO dao;
	
	@Override
	public List<ItemVO> list(String case_of) {

		return dao.list(case_of);
	}

	@Override
	public ItemVO view(String seq) {
		return dao.view(seq);
	}

	@Override
	public List<ItemVO> guSearch(String case_of, String kind_of, String gu) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("case_of", case_of);
		map.put("kind_of", kind_of);
		map.put("gu", gu);
		
		return dao.guSearch(map);
	}

	@Override
	public List<ItemVO> mylist(String uid) {
		return dao.mylist(uid);
	}

	@Override
	public List<ItemVO> mySearch(String case_of, String kind_of, String gu, String uid) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("case_of", case_of);
		map.put("kind_of", kind_of);
		map.put("gu", gu);
		map.put("uid", uid);
		
		return dao.mySearch(map);
	}


}
