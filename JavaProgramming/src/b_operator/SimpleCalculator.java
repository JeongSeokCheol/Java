package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("첫번째 수를 입력하세요> ");
		int num1 = Integer.parseInt(s.nextLine());
		System.out.print("연산자를 입력하세요> ");
		String a = s.nextLine();
		System.out.print("두번째 수를 입력하세요> ");
		int num2 = Integer.parseInt(s.nextLine());
		
		
		int result = a.equals("+") ? num1 + num2 :
						a.equals("-") ? num1 - num2 :
						a.equals("/") ? num1 / num2 : 
						a.equals("*") ? num1 * num2 :
						num1% num2;
						//null;
		System.out.println(num1+""+a+""+num2+"="+result);
		
		
		
	}

}
