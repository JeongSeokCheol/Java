package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		/*
		 * 123
		 * 135 : 1S 1B 1O
		 * 3자리의 수가 중복되지 않아야한다.
		 */

		int num1 = (int)(Math.random()*9)+1; //1~9 
		int num2 = (int)(Math.random()*9)+1;
		int num3 = (int)(Math.random()*9)+1;
		int sum = 0;
		int answer = 0;
		int a = 0;
		int b = 0;
		int c = 0;
	
		
		
		Scanner s = new Scanner(System.in);

		do {
			num1 = (int)(Math.random()*9)+1;
			num2 = (int)(Math.random()*9+1);
			num3 = (int)(Math.random()*9+1);
					}while(num1 == num2 || num2 == num3 || num1 == num3);
			sum = num1 * 100 + num2 * 10 + num3;
			
			System.out.println("===============베이스볼게임 시작===============");
			System.out.println(sum);
			
			
					
		do {
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			
			System.out.print("자신이 생각한 숫자를 입력하세요(0이외의 중복되지 않는 3자리수)> ");
			answer = Integer.parseInt(s.nextLine());
			a = (answer / 100) % 100;
			b = (answer / 10) % 10;
			c = answer  % 10;
			//answer  /= 10
			//b = answer % 10
			//answer  /= 10
			//c = answer % 10
			
//				if(num1 == a ) {
//					count1 ++;
//				}
//				else if(num1 == b || num1 ==c) {
//						count2 ++;
//					}
//				else if(num1 != a && num1 !=b && num1 !=c) {
//						count3 ++;
//					}
//				
//				
//				if(num2 == b ) {
//					count1 ++;
//				}
//				else if(num2 == a || num2 ==c) {
//						count2 ++;
//					}
//				else if(num2 != a && num2 !=b && num2 !=c) {
//						count3 ++;
//					}
//				
//				if(num3 == c ) {
//					count1 ++;
//				}
//				else if(num3 == b || num3 ==a) {
//						count2 ++;
//					}
//				else if(num3 != a && num3 !=b && num3 !=c) {
//						count3 ++;
//					}
//				if(a == 0 || b == 0 || c == 0) {
//					System.out.println("0을 입력하셨습니다. 다시입력하세요.");
//				}
//				if(a == b || a == c || b == c) {
//					System.out.println("중복된 값을 입력하셨습니다. 다시입력하세요.");
//				}

			
			
			if(num1 == a) count1++;
			if(num2 == b) count1++;
			if(num3 == c) count1++;
			
			if(num1== b|| num1 == c)count2++;
			if(num2== a|| num2 == c)count2++;
			if(num3== b|| num3 == a)count2++;
			
			count3 = 3 - count1 - count2;
			
			System.out.println("Strike: "+count1+" ball: "+count2+" out: "+count3);
		
		}while(answer != sum);
		System.out.println("정답입니다");
			
	}

}
