package kr.co.booktopia.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.booktopia.service.MainService;
import kr.co.booktopia.vo.ListVO;

@Controller
public class MainController {
	
	@Inject
	private MainService service;
	
	@RequestMapping(value="/")
	public String index(Model model) {
		List<ListVO> bestseller = service.indexBestseller();
		model.addAttribute("bestseller", bestseller);
		
		List<ListVO> newbook = service.indexNewbook();
		model.addAttribute("newbook", newbook);
		
		List<ListVO> steadyseller = service.indexSteadyseller();
		model.addAttribute("steadyseller", steadyseller);
		
		
		
		return "/index";
	}
}
