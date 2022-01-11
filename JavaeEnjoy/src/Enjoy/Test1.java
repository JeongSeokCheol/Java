package Enjoy;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		double num1;
		double num2;
		double result;
		String sign;
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("첫번째 숫자> ");
			num1 = Double.parseDouble(s.nextLine());
			System.out.print("연산자 적으세요> ");
			sign = s.nextLine();
			System.out.print("두번째 숫자> ");
			num2 = Double.parseDouble(s.nextLine());
			
		if(sign.equals("*")) {
			System.out.print("결과: " + (result = num1 * num2));
			break;
		}
		else if(sign.equals("/")) {
			System.out.print("결과: " + (result = num1 / num2));
			break;
		}
		else if(sign.equals("+")) {
			System.out.print("결과 : " + (result = num1 + num2));
			break;
		}
		else if(sign.equals("-")) {
			System.out.print("결과: " + (result = num1 - num2));
			break;
		}
		else  {
			System.out.println("잘못적으셨습니다.");
		}
	  }
	}

}
