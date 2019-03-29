package kr.co.cz.service;


import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.cz.dao.UploadDAO;
import kr.co.cz.vo.ItemVO;
import kr.co.cz.vo.UserVO;

@Service
public class UploadServiceImpl implements UploadService {

	@Inject
	private UploadDAO dao;
	
	@Override
	public void register(UserVO vo) {
		dao.register(vo);
	}

	@Override
	public void upload(ItemVO vo) {
		dao.upload(vo);
	}

	@Override
	public void modify(ItemVO vo) {
		dao.modify(vo);
	}

	@Override
	public Map<String, Object> usercheck(String uid) {
		return dao.usercheck(uid);
	}

	@Override
	public void regimodi(UserVO vo) {
		dao.regimodi(vo);
	}


}
