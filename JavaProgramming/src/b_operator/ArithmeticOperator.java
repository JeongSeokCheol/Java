package b_operator;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * - 사칙연산자 : +, -, *, /, %(나머지)
		 * - 복합연산자 : +=, -=, *=, /=, %=
		 * - 증감연산자 : ++, --
		*/
		
		
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		
		//나머지 연산
		result = 10 / 3;//몫
		System.out.println(result);
		result = 10 % 3;//나머지
		System.out.println(result);
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 결과를 출력해주세요.
		int _num1 = 10 + 10;
		int _num2 = 10 - 5;
		int _num3 = 10 * 20;
		int _num4 = 10 / 2;
		int _num5 = 11 % 2;
		
		System.out.println(_num1);
		System.out.println(_num2);
		System.out.println(_num3);
		System.out.println(_num4);
		System.out.println(_num5);
		
		//복합연산자
		result = result + 3;
		result += 3;
		
		result -= 5;
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result +10;
		result += 10;
		
		//result =result % 5;
		result %= 5;
		
		//result = result - 2 * 3;
		result -= (2*3);
		
		//증감연산자
		//증가연산자(++) : 변수의 값을 1증가시킨다.
		//감소연산자(--) : 변수의 값을 1감소시킨다.
		int i = 0;
		
		++i; //진위형 : 변수의 값을 읽어오기 전에 1증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1증가된다.
		--i;
		i--;
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double; //표현범위가 더 큰 타입으로 형변환된다.
		
		int result3 = _int + (int)_double;
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short; //int보다 작은 타입은 int로 형변환된다. (4byte이상으로 연산)
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2;
		System.out.println(_int);		
		
		//오버프로우(큰 값을 벗어나는것) , 언더플로우(작은 값을 벗어나는 것 )
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b =127;
		b++;
		System.out.println(b);
		b--;
		System.out.println(b);
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1.123456 + 654321
		//2. 1번의 결과값  * 123456
		//3. 2번의 결과값  / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값  % 123456
		long _test = 0 ;
		_test = 123456 + 654321;
		_test = _test * 123456;
		_test /= 123456;
		_test -= 654321;
		_test %= 123456;
		System.out.println(_test);
		
		//3개의 int타입 변수를 선언 및 초기화 후 할꼐화 평균을 구해주세요;
		int _a = 15;
		int _b = 22;
		int _c = 31;
		int _re = _a+_b+_c;
		double _res = _re / 3.0;
		System.out.println(_res);
		
		//반올림
		_res = Math.round(_res * 10) / 10.0;//소수점 첫째자리에서 반올림해준다.
		System.out.println(_res);
		
		//랜덤
		//Math.random(): 0.0 ~ 1.0미만
		int random = (int)(Math.random() * 100)+1; //1~100사이 랜덤
		System.out.println(random);

		
	}
	

}
