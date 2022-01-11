package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	뒷문자로 시작
		 * $ 	앞문자로 종료
		 * .	임의의 문자(줄바꿈 제외)
		 * *	앞문자가 0개 이상
		 * + 	앞문자가 1개 이상
		 * ?	앞문자가 없거나 1개
		 * []	문자의 집합이나 범위([a-z]:a부터 z까지)
		 * {}	앞문자의 개수({2}: 2개 {2,4}: 2개이상 4개 이하)
		 * ()	그룹화(1개의 문자처럼 인식)
		 * |	OR연산
		 *\s	공백, 탭, 줄바꿈
		 *\S	공백, 탭, 줄바꿈이 아닌 문자
		 *\w	알파벳이나 숫자
		 *\W 	알파벳이나 숫자가 아닌 문자
		 *\d 	숫자
		 *\D	숫자가 아닌 문자
		 *(?i)	뒷 문자의 대소문자 구분 안함
		 *\		정규표현식에서 사용되는 특수문자 표현
		 *
		 */
		
		//String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";//사이에 공백이 들어가면 안된다.
//		String regex = "[a-z0-9]+";
		//String regex = "\\w*";
		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
//		str = "d-1234";
		//String id = "[a-z0-9_-]{5,20}";
//		str = "010-3755-5615";
	//	String ph = "\\d{2,3}-\\d{3,4}-\\d{3,4}";
		String str = "ias0523@naver.com";
		String e = "(?i)[a-z0-9\\%?\\^%?\\&?]{5,14}@[a-z]{4,10}\\.(com|net|org|([a-z]{2}\\.kr))";
		
//		Pattern p = Pattern.compile(str);
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
		
;
		
//		String str1 = "add";
//		String e = "[a-z]{1,5}";
		Pattern p = Pattern.compile(e);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
		
		
	}

}
