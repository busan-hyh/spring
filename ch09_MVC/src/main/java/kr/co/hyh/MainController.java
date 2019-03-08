package kr.co.hyh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value="/hello.do")
	public String hello() {
		
		return "/hello";
	}
	
	@RequestMapping(value="/about1.do")
	public String about1() {
		
		return "/sub/about1";
	}
	
	@RequestMapping(value="/about2.do")
	public String about2() {
		
		return "/sub/about2";
	}
	
	@RequestMapping(value="/about3.do")
	public String about3() {
		
		return "/sub/about3";
	}

}
