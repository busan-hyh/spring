package kr.co.cz.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.cz.dao.MainDAO;
import kr.co.cz.vo.UserVO;

@Service
public class MainServiceImpl implements MainService {

	@Inject
	private MainDAO dao;
	
	@Override
	public UserVO login(UserVO vo) {
		return dao.login(vo);
	}

	@Override
	public void loginDate(UserVO vo) {
		dao.loginDate(vo);
	}

}
