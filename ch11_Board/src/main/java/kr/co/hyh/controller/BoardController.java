package kr.co.hyh.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import kr.co.hyh.service.BoardService;
import kr.co.hyh.vo.BoardVO;
import kr.co.hyh.vo.FileVO;
import kr.co.hyh.vo.MemberVO;


@Controller
public class BoardController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/list")
	public String list(String pg, Model model, HttpSession sess) {
		//1. LIMIT�� int
		int start = service.getLimitStart(pg);
		//2. ��������ȣ ���(�ϴܿ� �ߴ� ��������ȣ)
		int total = service.getTotal();
		int pgEnd = service.getPageEnd(total);
		//�� ī���� ��ȣ ���(�۹�ȣ)
		int count = total+1-start;
		//3. ������ �׷� ���(10���� �ߵ���)
		int[] groupStartEnd = service.getPageGroupStartEnd(pg, pgEnd);
		
		List<BoardVO> list = service.list(start);
		
		//���ǿ� ����� �г��� ��������
		MemberVO member = (MemberVO) sess.getAttribute("member");
		model.addAttribute("member", member);
		
		model.addAttribute("list", list);
		model.addAttribute("pageEnd", pgEnd);
		model.addAttribute("count", count);
		model.addAttribute("pageGroupStartEnd", groupStartEnd);
		return "/list";
	}
	
	@RequestMapping(value="/view")
	public String view(String seq, Model model, HttpSession sess) {
		BoardVO view = service.view(seq);
		List<BoardVO> comment = service.viewcomment(seq);
		
		model.addAttribute("view", view);
		
		if(comment.size() != 0 ) {
			model.addAttribute("comment", comment);
		} else {
			model.addAttribute("comment", null);
		}
		
		//���ǿ� ����� �г��� ��������
		MemberVO member = (MemberVO) sess.getAttribute("member");
		model.addAttribute("member", member);
		
		FileVO file = service.fileView(seq);
		model.addAttribute("file", file);
		
		
		return "/view";
	}
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write() {
		return "/write";
	}
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(BoardVO vo, HttpServletRequest req) {		
		// ���� ���ε� ó��(VO�� MultipartFileŸ���� Fname ����)
		MultipartFile fName = vo.getFname();
		int fParent = vo.getSeq();
		// ������ ������ fileUpload���� ���Ϲ��� ����(0or1) setFile
		FileVO filevo = service.fileUpload(req, fName);
		
		if(!vo.getFname().isEmpty()) {
			vo.setFile(1);
		} else {
			vo.setFile(0);
		}
		
		int newSeq = service.write(vo);

		// �������� ���̺� ����
		filevo.setParent(newSeq);
		service.fileWrite(filevo);
		
		return "redirect:/list";
	}
	
	@RequestMapping(value="/fileDownload")
	public void fileDownload(HttpServletRequest req, HttpServletResponse resp, String parent) {
		FileVO vo = service.fileView(parent);
		String filePath = req.getSession().getServletContext().getRealPath("/");
			   filePath += "resources/upload/"+vo.getNewName();
		service.fileUpdate(parent);
		try {
			File file = new File(filePath);
			
			String name = new String(vo.getOldName().getBytes("UTF-8"), "iso-8859-1");
			resp.setHeader("Cache-Control", "no-cache");
			resp.setHeader("Content-Disposition", "attachment; filename="+name);
			resp.setHeader("Content-Transfer-Encoding", "binary");
			resp.setHeader("Pragma", "no-cache");
			
			// ��Ʈ�� ���� : ���� ---- response��ü 
			BufferedInputStream  bis = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream bos = new BufferedOutputStream(resp.getOutputStream()); 
			
			
			byte buffer[] = new byte[1024*8];
			
			while(true){
				// Input��Ʈ������ ������ �о����	
				int read = bis.read(buffer);
				if(read == -1){
					break;
				}
				
				// Output ��Ʈ������ ������ ����
				bos.write(buffer, 0, read);
			}
			
			bis.close();
			bos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping(value="/delete")
	public String delete(String seq) {
		service.delete(seq);
		return "redirect:/list";
	}
	@RequestMapping(value="/commentdelete")
	public String commentDelete(String seq, String parent) {
		service.delete(seq);
		return "redirect:/view?seq="+parent;
	}
	
	@RequestMapping(value="/writecomment", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> writecomment(@RequestBody Map<String, Object> comment) {
		
		service.writecomment(comment);
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		String date = sdf.format(new Date());
		comment.put("date", date);
		
		return comment;
	}
}
