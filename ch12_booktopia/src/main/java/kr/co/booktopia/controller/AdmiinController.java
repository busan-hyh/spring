package kr.co.booktopia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdmiinController {

	@RequestMapping(value="/admin")
	public String admin() {
		return "/admin/index";
	}
	@RequestMapping(value="/admin/goods")
	public String goods() {
		return "/admin/goods/index";
	}
	@RequestMapping(value="/admin/goods/add")
	public String add() {
		return "/admin/goods/add";
	}
	@RequestMapping(value="/admin/order")
	public String order() {
		return "/admin/order/index";
	}
	@RequestMapping(value="/admin/member")
	public String member() {
		return "/admin/member/index";
	}
	
	
}
