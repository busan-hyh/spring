package kr.co.hyh.service;

import java.util.List;

import kr.co.hyh.vo.UserVO;

public interface UserService {
	
	public void userInsert(UserVO vo);
	public List<UserVO> userList();
	public void userView();
}
