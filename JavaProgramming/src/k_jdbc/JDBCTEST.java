package k_jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCTEST {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
	
		String sql =  " update test "
					+ " set t_name = ?"
					+ " where t_name = ?";
//					+ "and cart_qty > 0";

//		HashMap<String, Object> map = new HashMap<>();
//		map.put("cart_member", "a001");
//		map.put("cart_qty", "10");
		
		ArrayList<Object> param = new ArrayList<>();
		param.add("hi");
		param.add("J");

//		List<Map<String,Object>> list = jdbc.selectList(sql);
		int count = jdbc.update(sql,param);
		
		System.out.println(count);
		
		
	}
	
	

}
