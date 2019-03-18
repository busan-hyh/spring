package kr.co.cz.service;

import kr.co.cz.vo.UserVO;

public interface MainService {
	
	public UserVO login(UserVO vo);
	public void loginDate(UserVO vo);
}
