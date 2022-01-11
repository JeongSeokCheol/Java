package controller;

import java.util.Map;

import service.BoardService;
import service.UserService;
import util.ScanUtil;
import util.View;

public class Controller {

	public static void main(String[] args) {
		/*
		 * 발표내용 : 조 소개 > 주제 소개 > 주제 선정 배경 > 메뉴 구조 > 시연 > 프로젝트 후기
		 * 발표인원 : 발표자 1명 ppt 및 시연 도우미 1명
		 * 
		 * Controller : 화면 이동  while,for,switch등
		 * Service : 화면 기능 class
		 * Dao : 쿼리 작성 DB sql
		 * 웹개발을 할때 주로 사용되는 방식
		 */
		
		new Controller().start(); 
		
	}
	
	public static Map<String, Object> LoginMember;
	
	private UserService userService = UserService.getInstnace(); 
	private BoardService boardService = BoardService.getInstnace();

	private void start() {
		int view = View.HOME;
		
		while(true) {
			switch(view) {
			case View.HOME:
				view = home();
				break;
			
			case View.JOIN: //회원가입
				view = userService.join();
				break;
				
			case View.LOGIN: //로그인
				view = userService.login();
				break;
				
			case View.BOARD_LIST://게시판 목록
				view = boardService.boardList();
				break;
			case View.BOARD_VIEW:
				view = boardService.boardView();
				break;
			case View.BOARD_INSERT:
				view = boardService.boardInsert();
				break;
			case View.BOARD_CORECTION:
				view = boardService.boardCorection();
				break;
			case View.BOARD_DELETE:
				view = boardService.boardDelete();
				break;
			
			
			}
		}
	}

	private int home() {
		System.out.println("-----------------------------------");
		System.out.print("1.로그인 2.회원가입 0.프로그램 종료  > ");
		int input = ScanUtil.nextInt();
		
		switch(input) {
		case 1:
			return View.LOGIN; //메서드를 직접 설정하면 안됨 return만 해야함
		case 2:
			return View.JOIN;
		case 0:
			System.out.println("프로그램이 종료되었습니다.");
			System.exit(0);
		}
		return View.HOME;
	}

}
