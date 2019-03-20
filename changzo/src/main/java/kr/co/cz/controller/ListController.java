package kr.co.cz.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.cz.service.ListService;
import kr.co.cz.vo.ItemVO;

@Controller
public class ListController {

	@Inject
	private ListService service;
	
	@RequestMapping(value="/list")
	public String list(String case_of, Model model) {
		
		List<ItemVO> list = service.list(case_of);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key", case_of);
		map.put("map", list);
		model.addAttribute("list", map);
		
		return "/list/list";
	}
	@RequestMapping(value="/mylist")
	public String mylist() {
		return "/list/mylist";
	}
	@RequestMapping(value="/view")
	public String view(String seq, Model model) {
		ItemVO vo = service.view(seq);
		model.addAttribute("view", vo);
		
		return "/list/view";
	}
	
	@RequestMapping(value="/guSerch")
	public String guSerch(String paramList, String case_of, String gu, Model model) {
		
		List<ItemVO> list = service.guSerch(case_of, gu);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key", case_of);
		map.put("map", list);
		model.addAttribute("list", map);
		
		return "/list/"+paramList;
	}
	
	
	
}
