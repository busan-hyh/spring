package kr.co.booktopia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {

	@RequestMapping(value="/shop/search")
	public void search() { 
	}
	
	@RequestMapping(value="/shop/list")
	public String list(String sort) {
		return "/shop/list";
	}
	@RequestMapping(value="/shop/view")
	public String view(String goods_id) {
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
