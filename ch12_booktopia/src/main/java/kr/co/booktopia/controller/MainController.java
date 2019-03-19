package kr.co.booktopia.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.booktopia.service.MainService;
import kr.co.booktopia.vo.ListVO;
import net.coobird.thumbnailator.Thumbnails;

@Controller
public class MainController {
	
	@Inject
	private MainService service;
	
	@RequestMapping(value= {"", "/", "/index"})
	public String index(Model model) {
		
		Map<String, List<ListVO>> goodsMap = service.listGoods();
		model.addAttribute("goodsMap", goodsMap);
		
		
		return "/index";
	}
	
	@RequestMapping(value="/goods/thumbnail")
	protected void thumbnails(String fileName, String goods_id, HttpServletRequest request, HttpServletResponse response) throws IOException {
		// thumbnailator-0.4.8 라이브러리 : 썸네일을 부를때 신속 
		String imgPath = request.getSession().getServletContext().getRealPath("/")+"/resources/goods";
		
		OutputStream out = response.getOutputStream();
		String filePath = imgPath + "/" + goods_id + "/" + fileName;
		File image = new File(filePath);
		
		if(image.exists()) {
			Thumbnails.of(image).size(121,154).outputFormat("png").toOutputStream(out);
		}
		
		byte[] buffer = new byte[1024 * 8];
		out.write(buffer);
		out.close();
	}
}
