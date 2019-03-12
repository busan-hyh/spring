package kr.co.hyh.service;

import kr.co.hyh.vo.MemberVO;
import kr.co.hyh.vo.TermsVO;

public interface MemberService {
	public TermsVO terms();
	public void register(MemberVO vo);
	public void login();

}
