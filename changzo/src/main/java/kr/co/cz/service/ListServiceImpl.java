package kr.co.cz.service;

import java.util.List;

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

}
