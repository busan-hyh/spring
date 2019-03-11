package kr.co.hyh.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.hyh.dao.UserDao;
import kr.co.hyh.vo.UserVO;


@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDao dao;

	@Override
	public void userInsert(UserVO vo) {
		// TODO Auto-generated method stub
		dao.userInsert(vo);
	}

	@Override
	public List<UserVO> userList() {
		// TODO Auto-generated method stub
		return dao.userList();
	}
	
	@Override
	public void userView() {
		// TODO Auto-generated method stub
		dao.userView();
	}

}
