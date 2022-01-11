package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import e_oop.ScanUtil;

public class BoardClass {
ArrayList<HashMap<String, Object>> board = new ArrayList<>();
	
	HashMap<String, Object> list = new HashMap<>();

	SimpleDateFormat format = new SimpleDateFormat("MM/dd"); //mm:시간 , MM:월
	Date date = new Date(); 
	int number = 1;
	int count = 0;

	
	void PrintList() {
		System.out.println("==========================================================");
		System.out.println("번호\t제목\t작성자\t작성일");
		for(int i = board.size()-1; i >= 0; i -- ) {
				System.out.print(board.get(i).get("번호") + "\t");
				System.out.print(board.get(i).get("제목") + "\t");
				System.out.print(board.get(i).get("작성자") + "\t");
				System.out.println(board.get(i).get("작성일"));	
		}
		System.out.println("==========================================================");
		
	}
	
	void Open() {
		System.out.print("몇번을 열람 하시겠습니까? > ");
		int open = ScanUtil.nextInt();
		for(int i = 0 ; i < board.size(); i++) {
			if(board.get(i).get("번호").equals(open)) {
				System.out.println("==========================내용=============================");
				System.out.println("제목 : "+ board.get(i).get("제목"));
				System.out.println("내용 : " + board.get(i).get("내용"));
				System.out.println("==========================================================");
				}
		}
		OpenList(open);
		
		
	}
	
	void PutList() {
		list = new HashMap<>();
		Number();
		Title();
		Content();
		Writer();
		Date();
		board.add(list);
		
		}
	
	void Number() {
		
		list.put("번호", number);
		number++;
		count++;
		
	}
	
	void Title() {
		System.out.print("제목 : ");
		String title = ScanUtil.nextLine();
		list.put("제목", title);
	}
	
	void Content() {
		System.out.print("내용 : ");
		String content = ScanUtil.nextLine();
		list.put("내용", content);
		
	}
	
	void Writer() {
		System.out.print("작성자 : ");
		String writer = ScanUtil.nextLine();
		list.put("작성자", writer);
	}
	
	void Date() {
		list.put("작성일", format.format(date));
	}
	
	void OpenList(int open) {
		
		System.out.print("1.수정 2.삭제 3.목록 > ");
		int remove = ScanUtil.nextInt();
		switch(remove) {
		case 1:Correction(open);break;
		case 2: Remove(open);break;
		}

	}
	
	void Correction(int open) {
		for(int i = 0 ; i < board.size(); i++) {
			if((int)board.get(i).get("번호") == open) {
				list.remove("내용");
				list.remove("제목");
				if(list.get("제목") == null) {
					Title();
					}
				if(list.get("내용") == null) {
					Content();
				}
				
				}
			
			}
	}

	void Remove(int open) {
			board.remove(open-1);
			number--;
			for(int i = 0; i < board.size(); i++) {
				if(i >= open-1) {
					list = board.get(i);
					list.put("번호", i+1);
				}
			}
			
			
		
		
			 
	}
		
		
	
	
	






















}










