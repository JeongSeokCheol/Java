package a_varialbe;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		/*
		 * 아래와 같은 프로그램을 만들주세요
		 * 
		 * ==============회원가입===============
		 * 아이디>admin
		 * 비밀번호(4자리숫자)>1234
		 * 이름>홍길동
		 * 나이>99
		 * 키>185.5
		 * ===================================
		 * 회원가입 완료
		 * ==============내정보=================
		 * 아이디: admin
		 * 비밀번호: 1234
		 * 이름: 홍길동
		 * 나이: 99세
		 * 키: 185.5cm
		 * ====================================
		 * 
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("==============회원가입===============");
		System.out.print("아이디> ");
		String user = s.nextLine();
		System.out.print("비밀번호(4자리숫자)> ");
		int password = Integer.parseInt(s.nextLine());
		System.out.print("이름> ");
		String name = s.nextLine();
		System.out.print("나이> ");
		int age = Integer.parseInt(s.nextLine());
		System.out.print("키> ");
		double tall = Double.parseDouble(s.nextLine());
		System.out.println("===================================");
		System.out.println("회원가입 완료");
		System.out.println("===============내정보================");
		System.out.println("아이디: " + user + "\n비밀번호: "+ password + "\n이름: " + name + "\n나이: " + age+ "세" + "\n키: " + tall +"CM" );
		System.out.println("===================================");
		
		
		
		
	}

}
