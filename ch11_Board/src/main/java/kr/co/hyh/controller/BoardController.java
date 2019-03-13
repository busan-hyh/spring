package kr.co.hyh.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.hyh.service.BoardService;
import kr.co.hyh.vo.BoardVO;


@Controller
public class BoardController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/list")
	public String list(@RequestParam("pg") String pg, Model model) {
		//1. LIMIT�� int
		int start = service.getLimitStart(pg);
		//2. ��������ȣ ���(�ϴܿ� �ߴ� ��������ȣ)
		int total = service.getTotal();
		int pgEnd = service.getPageEnd(total);
		//�� ī���� ��ȣ ���(�۹�ȣ)
		int count = total+1-start;
		//3. ������ �׷� ���(10���� �ߵ���)
		int[] groupStartEnd = service.getPageGroupStartEnd(pg, pgEnd);
		
		List<BoardVO> vo = service.list(start);
		
		model.addAttribute("list", vo);
		model.addAttribute("pageEnd", pgEnd);
		model.addAttribute("count", count);
		model.addAttribute("pageGroupStartEnd", groupStartEnd);
		
		return "/list";
	}
	
	@RequestMapping(value="/view")
	public String view() {
		return "/view";
	}
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write() {
		return "/write";
	}
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(BoardVO vo) {		
		service.write(vo);
		return "/write";
	}
}
