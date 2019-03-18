package kr.co.cz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {

	@RequestMapping(value="/list")
	public String list() {
		return "/list/list";
	}
	@RequestMapping(value="/mylist")
	public String mylist() {
		return "/list/mylist";
	}
	@RequestMapping(value="/view")
	public String view() {
		return "/list/view";
	}
	
}
