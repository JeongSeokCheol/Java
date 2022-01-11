package Enjoy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test9 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "A");
		// List를 Set으로 변경
		Set<String> set = new HashSet<String>(list);
		// Set을 List로 변경
		List<String> newList =new ArrayList<String>(set);
		// 결과 출력
		System.out.println(newList);
	}
	

	
}
