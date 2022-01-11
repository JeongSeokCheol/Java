package k_jdbc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import e_oop.ScanUtil;

public class JDBCBoard {
	
	
 

	
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	ArrayList<HashMap<String, Object>> boardTable = new ArrayList<>();

	public static void main(String[] args) {
		
	
		
		
		while(true) {
			
			new JDBCBoard().Start();
			
		}
		
	}
	
	private void Start() {
		System.out.println("=================================================================");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("-----------------------------------------------------------------");
		
		JDBCUtil jdbc = JDBCUtil.getInstance();
		
		String sql = "SELECT A.BOARD_NO"
				+ "     , A.TITLE"
				+ "     , B.MEM_NAME"
				+ "     , TO_CHAR(A.REG_DATE, 'MM-DD') AS REG_DATE"
				+ "  FROM TB_JDBC_BOARD A"
				+ "  LEFT OUTER JOIN MEMBER B ON A.MEM_ID = B.MEM_ID"
				+ " ORDER BY A.BOARD_NO DESC";
		
		List<Map<String, Object>> boardList = jdbc.selectList(sql);
		for(int i = 0; i < boardList.size() ; i++) {
			Map<String, Object> board = boardList.get(i);
			System.out.print(board.get("번호") + "\t");
			System.out.print(board.get("제목") + "\t");
			System.out.print(board.get("작성자") + "\t");
			System.out.print(board.get("날짜") + "\n");
		}
		System.out.println("=====================================");
		
		System.out.print("1.조회  2.등록  0.종료 > ");
		int input = ScanUtil.nextInt();
		switch(input) {
		case 1: break;
		case 2: Insert(); break;
		case 0: System.exit(0);
		
		
		}
		
	}
	
	private void Insert() {
		
		int number = 0;
		number++;
		
		System.out.print("제목 : ");
		String title = ScanUtil.nextLine();
		System.out.print("내용 : ");
		String content = ScanUtil.nextLine();
		System.out.print("작성자 : ");
		String mem = ScanUtil.nextLine();
		
		JDBCUtil jdbc = JDBCUtil.getInstance();
		ArrayList<Object> param = new ArrayList<>();
		String sql = "INSERT INTO TB_JDBC_BOARD "
				   + "VALUES ((SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD)"
				   + "     , ?, ?, ?"
				   + "     , SYSDATE)";
		
		
		param.add(title);
		param.add(content);
		param.add(mem);
		
		jdbc.selectList(sql,param);
		
		HashMap<String, Object> board = new HashMap<>();
		board.put("번호", number);
		board.put("제목", title);
		board.put("내용", content);
		
		boardTable.add(board);
		
	}
	
	private void Delete() {
		
	}
	

}
