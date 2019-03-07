package kr.co.hyh;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

// 유저서비스를 구현하는 클래스
@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDAO dao;
	
	@Override
	public void insertUser(UserVO vo) throws Exception {
		dao.insertUser(vo);
	}

	@Override
	public List<UserVO> selectUserList() throws Exception {
		return dao.selectUserList();
	}
	
	@Override
	public UserVO selectUserOne(String uid) throws Exception {
		return dao.selectUserOne(uid);
	}

	@Override
	public void updateUser() throws Exception {
		dao.updateUser();
	}

	@Override
	public void deleteUser() throws Exception {
		dao.deleteUser();
	}
}
