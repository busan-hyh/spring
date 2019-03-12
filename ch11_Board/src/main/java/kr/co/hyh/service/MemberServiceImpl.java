package kr.co.hyh.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.hyh.dao.MemberDao;
import kr.co.hyh.vo.MemberVO;
import kr.co.hyh.vo.TermsVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDao dao;
	
	@Override
	public TermsVO terms() {
		return dao.terms();
	}

	@Override
	public void register(MemberVO vo) {
		dao.register(vo);
	}

	@Override
	public void login() {
		
	}

}
