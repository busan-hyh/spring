package kr.co.cz.service;

import java.util.List;

import kr.co.cz.vo.ItemVO;
import kr.co.cz.vo.UserVO;

public interface UploadService {
	public void register(UserVO vo);
	public void upload(ItemVO vo);
	public List<ItemVO> modify(String seq);
}
