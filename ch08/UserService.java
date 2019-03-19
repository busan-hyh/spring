package kr.co.ch08;

import java.util.List;

public interface UserService {
	
	public void insertUser(UserVO vo) throws Exception;
	public List<UserVO> selectUserList() throws Exception;
	public UserVO selectUserOne(String uid) throws Exception;
	public void updateUser() throws Exception;
	public void deleteUser() throws Exception;

}
