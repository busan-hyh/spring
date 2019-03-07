package kr.co.hyh;

import java.util.List;

// 유저서비스 인터페이스
public interface UserService {
	
	public void insertUser(UserVO vo) throws Exception;
	public List<UserVO> selectUserList() throws Exception;
	public UserVO selectUserOne(String uid) throws Exception;
	public void updateUser() throws Exception;
	public void deleteUser() throws Exception;
	
}
