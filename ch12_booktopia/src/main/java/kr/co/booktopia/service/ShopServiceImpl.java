package kr.co.booktopia.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.booktopia.dao.ShopDAO;
import kr.co.booktopia.vo.ListVO;

@Service
public class ShopServiceImpl implements ShopService {

	@Inject
	private ShopDAO dao;
	
	@Override
	public List<ListVO> list(String sort) {
		return null;
	}

	@Override
	public ListVO view(String goods_id) {
		return dao.view(goods_id);
	}

	

}
