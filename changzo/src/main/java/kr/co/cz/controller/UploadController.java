package kr.co.cz.controller;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.cz.service.UploadService;
import kr.co.cz.vo.ItemVO;
import kr.co.cz.vo.UserVO;

@Controller
public class UploadController {

	@Inject
	private UploadService service;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register() {
		return "/upload/register";
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(UserVO vo) {
		service.register(vo);
		return "redirect:/login";
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.GET)
	public String upload() {
		return "/upload/upload";
	}
	@RequestMapping(value="/uploadData", method=RequestMethod.GET)
	public Map<String, Object> upload(ItemVO vo) {
		return null;
	}
	
	@RequestMapping(value="/modify")
	public String modify() {
		return "/upload/modify";
	}
}
