package kr.co.cz.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.cz.dao.UploadDAO;
import kr.co.cz.vo.UserVO;

@Service
public class UploadServiceImpl implements UploadService {

	@Inject
	private UploadDAO dao;
	
	@Override
	public void register(UserVO vo) {
		dao.register(vo);
	}


}
