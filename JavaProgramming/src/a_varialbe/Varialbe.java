package a_varialbe; //클래스의 위치

import java.util.Scanner;
//package와Class사이에 위치
//Ctrl + Shift + o

public class Varialbe {

	public static void main(String[] args) {
        //main매서드 : 프로그램의 시작과 끝
		
        //주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용)
		
		//한줄 주석 : Ctrl + Shift + C
		/*범위주석 : Ctrl + Shift + /(해제:\)*/
		
		/*
		 * 데이터
		 * - 기본형
		 * - 배열
		 * - 클래스
		 * 
		 * 조작
		 * - 산술연산
		 * - 비교연산
		 * - 논리연산
		 * - 조건문
		 * - 반복문
		 */
		
		//데이터의 형태(데이터의 타입) + 이름
		/*
		 * 기본형타입
		 * - 정수 : byte(1), short(2), *int(4), long(8)
		 * - 실수 : float(4), *double(8)]
		 * - 문자 : char(2)
		 * - 논리 : boolean(1)
		 */
		
		int x;
		//변수를 만드는 것을 변수 선언이라고 표현한다.
		
//		double x;
		double y;
		
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장한다.
		
		x = 10; // 초기화 : 변수에 처음으로 값을 저장하는 것
		y = 3.14; // 변수의 타입에 맞는 값을 저장해야한다.
		
		int abc = 30;//일반적으로 선언과 초기화를 한번에 한다.
		long l = 40L;//접미사 L을 붙야야 long타입이 된다.
		float f = 5.5f;//접미사 f를 븥여야 float타입이 된다.
		char c = '한'; //따옴표안에 반드시 한글자를 넣어야 한다.
		boolean b = true; //true,false
		
		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		byte by = 1;
		short st= 2;
		int i = 3;
		long lo = 4L;
		float fl = 5.5f;
		double du = 6.6;
		char ch = '안';
		boolean boo = false;
		
		x = 20;// 다시 초기화
		y = 5.5; //다시 초기화할시 데이터타입을 쓰면 안됨
		
		//위에서 만든 8개의 변수에 값을 저장해주세요.
		by = 7;
		st = 8;
		i = 9;
		lo = 10L;
		fl = 11.11f;
		du = 12.12;
		ch = '녕';
		boo = true;
		
		/*
		 * 명명규칙
		 * - 영문자 대소문자, 할글, 숫자, 특수문자('_','$')를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어(JAVA에서 사용하고 있는 단어)는 사용할 수 없다.
		 * - [낙타식 표기법(단어가 바뀔떄마다 대문자)을 사용한다.(mySampleClass)]
		 * - [클래스명의 첫 글자는 대문자로 한다.(MySampleClass)] 클래스만 대문자 시작
		 */
		
		//형변환(데이터의 타입을 다른 타입으로 변경하는 것)
		int _int = 10;
		long _long = 20L;
		
		_int = (int)_long;
		_long = _int;//표현범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다.
		
		//변수 3개를 선언해 변수의 타입과 다른 타입의 값으로 초기화 해주세요.
		int _int1 = 1;
		double _double1 = 3.14;
		char _char1 = '2';
		boolean _boolean1 = true;
		
		_int1 = (int)_double1;
		_double1 = _char1;
		_char1 = (char)_int1;
		
		
		//출력(콘솔)
		System.out.print("출력");
		System.out.println("출력 후 줄바꿈");
		System.out.printf("출력 포맷 지정");
		//Ctrl + F11
		
		System.out.println(x);
		System.out.println(y);
		
		String str = "문자열"; //문자열을 만들기위한 Class(참조형)
		System.out.println(str + x +y); //String이 앞에서 연산시 문자열은 반드시 숫자로 바뀐다
		System.out.println(x + y + str); //String이 뒤에서 연산시 앞에 연산 후 문자열 그대로 출력
		
		//탈출 문자(Escape 문자)
		System.out.println("탭은\t4칸에맞춰 띄워줍니다.");
		System.out.println("줄바꿈은\n이해줍니다.");
		System.out.println("\"쌍따옴표를넣어줍니다.\"");
		System.out.println("\\역슬래시를 넣어줍니다");
		
		//입력
		Scanner s = new Scanner(System.in);
//		
//		System.out.print("아무거나 입력해주세요> ");
//		String str2 = s.nextLine();//()괄호가 붙어있으면 무조건 매서드
//		System.out.println("입력받은 내용: " + str2);
//		
//		System.out.println("숫자 입력> ");
//		int num = sc.nextInt();
//		System.out.println("입력받은 숫자: " + num);
//		System.out.print("문자열 입력>");
//		String str3 = sc.nextLine();
//		System.out.println("입력받은 내용: " + str3);
//		System.out.println("입력 끝!");
//		
//		System.out.println("숫자입력>");
//		int num = Integer.parseInt(s.nextLine());//정수
//		double num2 = Double.parseDouble(s.nextLine());//실수
//		System.out.println(num);
		
		
		//자신의 이름을 저장할 변수를 선언하고 Scanner를 사용해 이름을 저장해주세요.
		
		System.out.print("자신의 이름을 적어주세요: ");
		String myName = s.nextLine();
		
		//자신의 나이를 저장할 변수를 선언하고 Scanner를 사용해 나이를 저장해주세요
		System.out.print("자신의 나이를 입력하세요: ");
		int myAge = Integer.parseInt(s.nextLine());
		
		//이름과 나이를 출력해주세요
		System.out.print("이름: " + myName + " / 나이: " + myAge);
		
		
		
		
		}
		

		
}
		
		
