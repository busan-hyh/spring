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
		//pg���� ���޾Ƽ� list.jsp?pg=�� ���� ������Ʈ������ �߹Ƿ� NULLüũ�� �ؾ��Ѵ�. 
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
		//ex>[currentPage/10+1] 3pg�� ��� 0.33...������ int�̹Ƿ� 0�� ����. �ű�+1
		//	 [(int)Math.ceil(currentPage/10.0)] ������ 10pg�� +1�ϸ� �ȵǹǷ� 3pg�� 10.0�� ������ 0.333�� ���ö� �ø��ϸ� �ȴ�
		int groupStart = (currentPageGroup - 1) * 10 + 1; //�� �׷��� ���۹�ȣ ���
		int groupEnd = currentPageGroup * 10; //�� �׷��� ����ȣ ���
		if (groupEnd > pgEnd) { //39pg���� �ִµ� 40�� �߸� �ȵǹǷ�
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
		// ���� ���丮 ����
		String path = req.getSession().getServletContext().getRealPath("/");
		path += "resources/upload/";
		
		if(!fName.isEmpty()) {
			// ������ ÷�ε�����
			// �����̸� ó��
			String oName = fName.getOriginalFilename();
			String ext = oName.substring(oName.lastIndexOf("."));
			// uuid : �ߺ����� �ʴ� ���̵� ����
			String uName = UUID.randomUUID().toString()+ext;
			
			// JSP_FILE ���̺� ���ϸ� ����
			FileVO vo = new FileVO();
			vo.setParent(fParent);
			vo.setOldName(oName);
			vo.setNewName(uName);
			dao.fileUpload(vo);
			
			// ���� ����
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
