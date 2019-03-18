package kr.co.booktopia.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.booktopia.dao.MainDAO;
import kr.co.booktopia.vo.ListVO;

@Service
public class MainServiceImpl implements MainService {

	@Inject
	private MainDAO dao;
	
	@Override
	public List<ListVO> indexBestseller() {
		return dao.indexBestseller();
	}

	@Override
	public List<ListVO> indexNewbook() {
		return dao.indexNewbook();
	}

	@Override
	public List<ListVO> indexSteadyseller() {
		return dao.indexSteadyseller();
	}

}
