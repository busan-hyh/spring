package kr.co.hyh.service;

import java.util.Map;

import kr.co.hyh.vo.MemberVO;
import kr.co.hyh.vo.TermsVO;

public interface MemberService {
	public TermsVO terms();
	public void register(MemberVO vo);
	public Map<String, Object> usercheck(String uid);
	public MemberVO login(MemberVO vo);

}
