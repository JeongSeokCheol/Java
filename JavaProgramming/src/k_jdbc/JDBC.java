package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		/*
		 *  JDBC(Java Database Connectivity)
		 *  - 자바와 데이터베이스를 연결해주는 라이브러리
		 *  - ojdbc : 오라클  JDBC
		 *  
		 *  JDBC 작성 단계
		 *  1. Connection 생성(DB 연결)
		 *  2. Statement 생성 (쿼리 작성)
		 *  3. Query 실행
		 *  4. ResultSet에서 결과 추출(select인 경우)
		 *  5. ResultSet, Statement, Connection 닫기
		 */
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "JSC96";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "select * from member";
			ps = con.prepareStatement(sql); //내용을 객체로 만듦
			
			//select
			rs = ps.executeQuery();
			
			//insert, delete, update
//			int result = ps.executeUpdate();
			
			      //ResultSet 의 첫번째 줄을 바라복 결과를 추출  next()가 다시 호출되면 다음줄로 넘어간다 다음줄이 있으면 true 없으면 false 
			while(rs.next()) {
				String memId = rs.getString(1); //컬럼의 인덱스를 넣어준 것이다.
				String memPass = rs.getString("MEM_PASS"); //컬럼명을 넣어준 것 이다.
				System.out.println("MEM_ID : " + memId + " / MEM_PASS : " + memPass);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
			
		}
		
		
		
		
	}

}
