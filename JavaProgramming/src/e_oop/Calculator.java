package e_oop;

public class Calculator {

	// +, -, *, /, % 다섯개의 연산을 수행 할 수있는 계산기 클래스를 만들어주세요.
	double add(double x , double y) {
		return x + y;
	}
	
	double subtrack(double x, double y) {
		return x - y;
	}
	
	double multiply(double x, double y) {
		return x * y;
	}
	
	double division(double x, double y) {
		return x / y;
	}
	
	double rest(double x, double y) {
		return x % y;
	}
	
	public static void main(String[] args) {
		//calculator 클래스를 사용해 다음을 계산해 주세요.
		//다음을 한줄씩 계산해서 최종 결과 값을 출력 해주세요.
		//1.123456 + 654321
		//2.1번의 결과값 * 123456
		//3.2번의 결과값 / 123456
		//4.3번의 결과값  - 645321
		//5.4번의 결과값 % 123456
		
		Calculator c = new Calculator();
		double result = c.add(123456, 654321);
		System.out.println(result);
		result = c.multiply(result, 123456);
		System.out.println(result);
		result = c.division(result, 123456);
		System.out.println(result);
		result = c.subtrack(result, 654321);
		System.out.println(result);
		result = c.rest(result, 123456);
		System.out.println(result);
		
		
	}

}
