package kr.co.cz.service;

import kr.co.cz.vo.ItemVO;
import kr.co.cz.vo.UserVO;

public interface UploadService {
	public void register(UserVO vo);
	public void upload(ItemVO vo);
	public void modify(ItemVO vo);
}
