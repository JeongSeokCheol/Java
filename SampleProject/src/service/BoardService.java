package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import controller.Controller;
import dao.BoardDao;
import util.ScanUtil;
import util.View;

public class BoardService {
	
	private BoardService() {}
	private static BoardService instance;
	public static BoardService getInstnace() {
		if(instance == null) {
			instance= new BoardService();
		}
		return instance;
	}
	
	private BoardDao boardDao = BoardDao.getInstnace();
	int boardno = 0;
	
	public int boardList() {
		List<Map<String, Object>> boardList = boardDao.selectBoardList();
		
		System.out.println("==================================================");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("--------------------------------------------------");
		for(int i = 0; i < boardList.size(); i++) {
			Map<String , Object> board = boardList.get(i);
			System.out.print(board.get("BOARD_NO") + "\t");
			System.out.print(board.get("TITLE") + "\t");
			System.out.print(board.get("MEM_NAME") + "\t");
			System.out.println(board.get("REG_DATE") + "\t");
		}
		System.out.println("==================================================");
		
		System.out.print("1.조회 2.등록 0.로그아웃 > ");
		int input = ScanUtil.nextInt();
		
		switch(input) {
		case 1: //조회
			return View.BOARD_VIEW;
		case 2: //등록
			return View.BOARD_INSERT;
		case 0:	//로그아웃
			Controller.LoginMember = null;
			return View.HOME;
		}
		return View.BOARD_LIST;
	}
	
	public int boardView() {
		System.out.println("---------------[ 조회 ]----------------");
		System.out.print("조회할 게시물 번호>");
		int boardNo = ScanUtil.nextInt();
		boardno=boardNo;
		boardDao.boardView(boardNo);
		
		Map<String, Object> board = boardDao.boardView(boardNo);
		
		System.out.println("=====================================");
		System.out.println("번호\t: " + board.get("BOARD_NO"));
		System.out.println("작성자\t: " + board.get("MEM_NAME"));
		System.out.println("작성일\t: " + board.get("REG_DATE"));
		System.out.println("제목\t: " + board.get("TITLE"));
		System.out.println("내용\t: " + board.get("CONTENT"));
		System.out.println("=====================================");
		
		System.out.print("1.수정 2.삭제 0.목록");
		int input = ScanUtil.nextInt();
		switch(input) {
		case 1:
			return View.BOARD_CORECTION;
		case 2:
			return View.BOARD_DELETE;
		
		}
		
		return View.BOARD_LIST;
		
	}
	
	public int boardInsert() {
		System.out.println("---------------[ 등록 ]----------------");
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("아이디>");
		String memId = ScanUtil.nextLine();
		
		Map<String, Object> param = new HashMap<>();
		param.put("TITLE", title);
		param.put("CONTENT", content);
		param.put("MEM_ID", memId);

		if(0 < boardDao.boardInsert(param)) {
			System.out.println("등록이 완료 되었습니다.");
		}else {
			System.out.println("등록에 실패하였습니다.");
		}
		
		
		return View.BOARD_LIST;
	}
	
	public int boardCorection() {
		System.out.println("---------------[ 수정 ]----------------");
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		
		Map<String, Object> param = new HashMap<>();
		param.put("TITLE", title);
		param.put("CONTENT", content);
		param.put("BOARD_NO", boardno);
		
		if(0 < boardDao.boardCorection(param)) {
			System.out.println("수정되었습니다.");
		}else {
			System.out.println("수정에 실패하였습니다.");
		}
		
		return View.BOARD_LIST;
	}

	public int boardDelete() {
		System.out.println("---------------[ 삭제 ]----------------");
		System.out.print("정말 삭제하시겠습니까?(Y/N)>");
		String yn = ScanUtil.nextLine();
		
		if(yn.equalsIgnoreCase("Y")) {
			Map<String, Object> param = new HashMap<>();
			param.put("BOARD_NO", boardno);
		
		if(0 < boardDao.boardDelete(param)) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("삭제에 실패하였습니다.");
		}
	}else {
		System.out.println("삭제를 취소하였습니다.");
	}
		
		
		return View.BOARD_LIST;
	}

	
}
