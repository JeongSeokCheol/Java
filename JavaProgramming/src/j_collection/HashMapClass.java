package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

import e_oop.ScanUtil;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든키를 Set으로 반환환다.
		 */
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("age", 10);
		map.put("name","홍길동");
		map.put("date",new Date());
		
		System.out.println(map);
		
		map.put("name", "이순신");
		System.out.println(map);
		
		Object value = map.get("name");
		System.out.println(value);
		((String)value).substring(1,2);
		String val  = (String)map.get("name");
		
		Set<String> keys = map.keySet();
		
		//향상된 for문
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
		
		ArrayList<HashMap<String, Object>> lprodTable = new ArrayList<>();
		
		HashMap<String, Object> lprod = new HashMap<>();
		//1 P101 컴퓨터의 제품
		lprod.put("LPROD_ID",1);
		lprod.put("LPROD_GU","P101");
		lprod.put("LPROD_NM","컴퓨터제품");
		
		lprodTable.add(lprod);
		
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 2);
		lprod.put("LPROD_GU", "P102");
		lprod.put("LPROD_NM", "전자제품");
		
		lprodTable.add(lprod);
		
		
		System.out.println(lprodTable);
		
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 3);
		lprod.put("LPROD_GU", "P201");
		lprod.put("LPROD_NM", "여성캐주얼");
		
		lprodTable.add(lprod);
		
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 4);
		lprod.put("LPROD_GU", "P202");
		lprod.put("LPROD_NM", "남성캐주얼");
		
		lprodTable.add(lprod);
		
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 5);
		lprod.put("LPROD_GU", "P301");
		lprod.put("LPROD_NM", "피혁잡화");
		
		lprodTable.add(lprod);
		
		System.out.print("LPROD_ID > ");
		int answer = ScanUtil.nextInt();
		
		
		for(int i = 0 ; i < lprodTable.size(); i++) {
			if((int)lprodTable.get(i).get("LPROD_ID") == answer) {
				System.out.println(lprodTable.get(i));
			}
		}
		switch(answer) {
		case 1: System.out.println(lprodTable.get(answer-1)); break;
		case 2: System.out.println(lprodTable.get(answer-1)); break;
		case 3: System.out.println(lprodTable.get(answer-1)); break;
		case 4: System.out.println(lprodTable.get(answer-1)); break;
		case 5: System.out.println(lprodTable.get(answer-1)); break;
		}
		
		for(int i = 0; i < lprodTable.size(); i ++) {
			if(lprodTable.get(i).get("LPROD_ID").equals(answer)) {
			for(String key : lprodTable.get(i).keySet() ) {
				System.out.print(key + " : " + lprodTable.get(i).get(key)+ " \t");
				}
			}
		}
		
	}

}
