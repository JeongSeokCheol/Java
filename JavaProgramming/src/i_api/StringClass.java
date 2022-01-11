package i_api;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * String
		 * - 여러개의 문자를 사용하기 쉽게 만들어 놓은 클래스
		 * - equals() : 문자열의 내욜리 같은지 반환한다.
		 * - length() : 문자열의 길이를 반환한다
		 * - charAt() : 특정 인덱스의 위치한 문자를 반환한다.
		 * - substring() : 문자열의 특정 부분을 잘라서 반환한다.
		 * - indexOf() : 문자열 내의 특정 문자의 인덱스를 반환한다.
		 * - contains() : 문자열이 특정 문자열을 포함하고 있는지 여부를 반환한다.
		 * - split() :  문자열 내의 특정문자를 다른 문자로 바꿔서 반환한다.
		 * - replace() : 문자열 내의 특정 문자를 다른 문자로 바꿔서 반환한다.
		 * - trim() : 문자열 앞뒤의 공백을 제거해 반환한다.
		 * - valueOf() : 다른타입의 데이터를 문자열로 변환해 반환한다.
		 */
		
		boolean equals = "문자열".equals("비교할 문자열");
		System.out.println(equals);
		
		String str = "12345";
		int length = str.length();
		for(int i = 0; i < length; i++) {
			char charat = str.charAt(i);
			System.out.println(charat);
		}
		
		//문자열 뒤집기
		String rev = "";
		for (int i = str.length() - 1; 0 <= i ; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		
		str = "0123456789";
		String sub1 = str.substring(3); //3번 인덱스부터 잘라서 반환한다.
		System.out.println(sub1);
		String sub2 = str.substring(5, 8);
		System.out.println(sub2);
		
		str = "수박 오렌지 귤 블루베리";
		int indexOf = str.indexOf("오렌지"); //오렌지의 시작 인덱스를 반환한다.
		System.out.println(indexOf);
		
		//substring과 indexOf를 조합해서 문자열 자르기
		String[] menu = {
				"수박 20000원",
				"오렌지 100000원",
				"귤 500원",
				"블루베리 3000원"
		};
		 
		for(int i = 0; i < menu.length; i++) {
			String name = menu[i].substring(0,menu[i].indexOf(" "));
			System.out.println(name);
		}
		
		for(int i = 0; i < menu.length; i++) {
			int price = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ")+1,menu[i].indexOf("원")));
			System.out.println(price);
		}
		
		str = "abcd";
		boolean contains = str.contains("c");
		System.out.println(contains);
		
		//오렌지가 메뉴의 몇번인덱스에 있는지 찾기
		for(int i = 0 ; i < menu.length ; i++) {
			if(menu[i].contains("오렌지")) {
				System.out.println("오렌지는" + i + "번 인덱스에 있습니다.");
			}
		}
		
		str = "a/b/c";
		String[] split = str.split("/");
		System.out.println(Arrays.toString(split));
		
		//메뉴명과 가격 나누기
		for(int i = 0; i < menu.length; i++) {
			String[] split2 = menu[i].split(" ");
			System.out.println("메뉴명: "+ split2[0] + " / 가격: "+ split2[1]);
		}
		
		str = "123123123123";
		String replace = str.replace("3", "짝");
		System.out.println(replace);
		
		str = " 문 자 열 "; //중간은 공백제거가 되지 않는다
		String trim = str.trim();
		System.out.println("[" + str + "] -> [" + trim + "]");
		
		int num = 10;
		str = num + "";
		str = String.valueOf(num);
		System.out.println(num);
		
	}

}
