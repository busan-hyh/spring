package kr.co.booktopia.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.booktopia.service.ShopService;
import kr.co.booktopia.vo.ListVO;

@Controller
public class ShopController {

	@Inject
	private ShopService service;
	
	@RequestMapping(value="/shop/search")
	public void search() { 
	}
	
	@RequestMapping(value="/shop/list")
	public String list(String sort) {
		return "/shop/list";
	}
	@RequestMapping(value="/shop/view")
	public String view(String goods_id, Model model) {
		ListVO view = service.view(goods_id);
		model.addAttribute("view", view);
		
		return "/shop/view";
	}
	@RequestMapping(value="/shop/order")
	public String order() {
		return "/shop/order";
	}
	@RequestMapping(value="/shop/cart")
	public String cart() {
		return "/shop/cart";
	}
}
