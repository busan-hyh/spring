package kr.co.ch08;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDao dao;
	
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
