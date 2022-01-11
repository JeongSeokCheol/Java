package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class BoardDao {
	
	private BoardDao() {}
	private static BoardDao instance;
	public static BoardDao getInstnace() {
		if(instance == null) {
			instance= new BoardDao();
		}
		return instance;
	}
	
	private JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<Map<String, Object>> selectBoardList(){
		String sql = "SELECT A.BOARD_NO"
				+ "         ,A.TITLE"
				+ "			,B.MEM_NAME"
				+ "         ,TO_CHAR(A.REG_DATE, 'MM-DD') AS REG_DATE"
				+ "    FROM TB_JDBC_BOARD A"
				+ "	   LEFT OUTER JOIN TB_JDBC_MEMBER B ON A.MEM_ID = B.MEM_ID"
				+ "   ORDER BY A.BOARD_NO DESC";
		
		return jdbc.selectList(sql);
	}
	
	public Map<String, Object> boardView(int boardNo){
		String sql = "SELECT A.BOARD_NO"
				+ "     , A.TITLE"
				+ "     , A.CONTENT"
				+ "     , B.MEM_NAME"
				+ "     , TO_CHAR(A.REG_DATE, 'MM-DD') AS REG_DATE"
				+ "  FROM TB_JDBC_BOARD A"
				+ "  LEFT OUTER JOIN TB_JDBC_MEMBER B ON A.MEM_ID = B.MEM_ID"
				+ " WHERE A.BOARD_NO = ?";
		
		List<Object> param = new ArrayList<>();
		param.add(boardNo);
		
		return jdbc.selectOne(sql,param);
	}

	public int boardInsert(Map<String, Object> param) {
		String sql = "INSERT INTO TB_JDBC_BOARD "
				   + "VALUES ((SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD)"
				   + "     , ?, ?, ?"
				   + "     , SYSDATE)";
		List<Object> p = new ArrayList<>();
		p.add(param.get("TITLE"));
		p.add(param.get("CONTENT"));
		p.add(param.get("MEM_ID"));
		
		
		
		
		return jdbc.update(sql,p);
		
	}
	
	
	public int boardCorection(Map<String, Object> param) {
		String sql = "UPDATE TB_JDBC_BOARD"
				   + "   SET TITLE = ?"
				   + "     , CONTENT = ?"
				   + " WHERE BOARD_NO = ?";
		
		List<Object> p = new ArrayList<>();
		p.add(param.get("TITLE"));
		p.add(param.get("CONTENT"));
		p.add(param.get("BOARD_NO"));
		
		return jdbc.update(sql,p);
	}
	
	
	public int boardDelete(Map<String, Object> param) {
		String sql = "DELETE "
				   + "  FROM TB_JDBC_BOARD"
				   + " WHERE BOARD_NO = ?";
		
		List<Object> p = new ArrayList<>();
		p.add(param.get("BOARD_NO"));
		
		return jdbc.update(sql,p);
	}
	
}
