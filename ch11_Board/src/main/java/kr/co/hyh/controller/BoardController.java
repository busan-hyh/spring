package kr.co.hyh.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import kr.co.hyh.service.BoardService;
import kr.co.hyh.vo.BoardVO;
import kr.co.hyh.vo.MemberVO;


@Controller
public class BoardController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/list")
	public String list(String pg, Model model, HttpSession sess) {
		//1. LIMIT용 int
		int start = service.getLimitStart(pg);
		//2. 페이지번호 계산(하단에 뜨는 페이지번호)
		int total = service.getTotal();
		int pgEnd = service.getPageEnd(total);
		//글 카운터 번호 계산(글번호)
		int count = total+1-start;
		//3. 페이지 그룹 계산(10개씩 뜨도록)
		int[] groupStartEnd = service.getPageGroupStartEnd(pg, pgEnd);
		
		List<BoardVO> list = service.list(start);
		
		//세션에 저장된 닉네임 가져오기
		MemberVO member = (MemberVO) sess.getAttribute("member");
		model.addAttribute("member", member);
		
		model.addAttribute("list", list);
		model.addAttribute("pageEnd", pgEnd);
		model.addAttribute("count", count);
		model.addAttribute("pageGroupStartEnd", groupStartEnd);
		return "/list";
	}
	
	@RequestMapping(value="/view")
	public String view(String seq, Model model, HttpSession sess) {
		BoardVO view = service.view(seq);
		List<BoardVO> comment = service.viewcomment(seq);
		
		model.addAttribute("view", view);
		
		if(comment.size() != 0 ) {
			model.addAttribute("comment", comment);
		} else {
			model.addAttribute("comment", null);
		}
		
		//세션에 저장된 닉네임 가져오기
		MemberVO member = (MemberVO) sess.getAttribute("member");
		model.addAttribute("member", member);
		
		return "/view";
	}
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write() {
		return "/write";
	}
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(BoardVO vo, HttpServletRequest req) {		
		// 파일 업로드 처리(VO에 MultipartFile타입인 Fname 생성)
		MultipartFile fName = vo.getFname();
		int fParent = vo.getSeq();
		// 파일이 있으면 fileUpload에서 리턴받은 숫자(0or1) setFile
		vo.setFile(service.fileUpload(req, fName, fParent));
		
		service.write(vo);
		
		return "redirect:/list";
	}
	
	@RequestMapping(value="/delete")
	public String delete(String seq) {
		service.delete(seq);
		return "redirect:/list";
	}
}
