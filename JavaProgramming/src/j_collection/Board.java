package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {

	public static void main(String[] args) {
		
		/*
		 * ArrayList 와  HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어 주세요.
		 * 
		 * 컬럼 : 번호, 제목, 내용, 작성자, 작성일
		 * 
		 * 첫화면: 목록
		 * 목록: 조회, 등록, 종료
		 * 조회: 수정, 삭제, 목록
		 */
		
		
		BoardClass bc = new BoardClass();
		
				
				
		
		
		
		while(true) {
			bc.PrintList();
		
		System.out.print("1.조회 2.등록 0.종료 > ");
		int answer = ScanUtil.nextInt();
		switch(answer) {
		
		case 0: System.exit(0);
		case 1: bc.Open();break;			
		case 2:bc.PutList();break;
			
			
		}

		
		}
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	



}










