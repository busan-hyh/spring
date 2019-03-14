package kr.co.hyh.service;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.hyh.dao.BoardDao;
import kr.co.hyh.vo.BoardVO;
import kr.co.hyh.vo.FileVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDao dao;
	
	@Override
	public List<BoardVO> list(int start) {
		return dao.list(start);
	}

	@Override
	public BoardVO view(String seq) {
		return dao.view(seq);
	}

	@Override
	public List<BoardVO> viewcomment(String seq) {
		return dao.viewcomment(seq);
	}

	@Override
	public void write(BoardVO vo) {
		dao.write(vo);
	}

	@Override
	public int getLimitStart(String pg) {
		int start = 0;
		//pg값을 못받아서 list.jsp?pg=를 띄우면 널포인트에러가 뜨므로 NULL체크를 해야한다. 
		if(pg == null){
			start = 1;
		}else{
			start = Integer.parseInt(pg);
		}
		
		return (start - 1) * 10;
	}

	@Override
	public int getTotal() {
		return dao.getTotal();
	}

	@Override
	public int getPageEnd(int total) {
		int pgEnd = 0;
		
		if(total % 10 == 0) {
			pgEnd = total/10;
		} else {
			pgEnd = (total/10) + 1;
		}
		
		return pgEnd;
	}

	@Override
	public int[] getPageGroupStartEnd(String pg, int pgEnd) {
		int[] groupStartEnd = new int[2];
		
		int current = 0;
		if(pg == null) {
			current = 1;
		}else {
			current = Integer.parseInt(pg);
		}
		int currentPage = current;
		int currentPageGroup = (int)Math.ceil(currentPage/10.0);
		//ex>[currentPage/10+1] 3pg의 경우 0.33...이지만 int이므로 0이 나옴. 거기+1
		//	 [(int)Math.ceil(currentPage/10.0)] 하지만 10pg는 +1하면 안되므로 3pg를 10.0로 나눠서 0.333이 나올때 올림하면 된당
		int groupStart = (currentPageGroup - 1) * 10 + 1; //각 그룹의 시작번호 계산
		int groupEnd = currentPageGroup * 10; //각 그룹의 끝번호 계산
		if (groupEnd > pgEnd) { //39pg까지 있는데 40이 뜨면 안되므로
			groupEnd = pgEnd;
		}
		groupStartEnd[0] = groupStart;
		groupStartEnd[1] = groupEnd;

		return groupStartEnd;
	}

	@Override
	public void delete(String seq) {
		dao.delete(seq);
	}

	@Override
	public int fileUpload(HttpServletRequest req, MultipartFile fName, int fParent) {
		// 파일 디렉토리 설정
		String path = req.getSession().getServletContext().getRealPath("/");
		path += "resources/upload/";
		
		if(!fName.isEmpty()) {
			// 파일이 첨부됐을때
			// 파일이름 처리
			String oName = fName.getOriginalFilename();
			String ext = oName.substring(oName.lastIndexOf("."));
			// uuid : 중복되지 않는 아이디값 제공
			String uName = UUID.randomUUID().toString()+ext;
			
			// JSP_FILE 테이블에 파일명 저장
			FileVO vo = new FileVO();
			vo.setParent(fParent);
			vo.setOldName(oName);
			vo.setNewName(uName);
			dao.fileUpload(vo);
			
			// 파일 전송
			try {
				fName.transferTo(new File(path+uName));
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			return 1;
		} else {
			return 0;
		}
	}


}
