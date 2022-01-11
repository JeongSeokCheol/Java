package Enjoy;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
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
			
			System.out.print("자신이 생각한 숫자를 입력하세요> ");
			answer = Integer.parseInt(s.nextLine());
			a = (answer / 100) % 100;
			b = (answer / 10) % 10;
			c = answer  % 10;
			
				if(num1 == a ) {
					count1 ++;
				}
				else if(num1 == b || num1 ==c) {
						count2 ++;
					}
				else if(num1 != a && num1 !=b && num1 !=c) {
						count3 ++;
					}
				
				
				if(num2 == b ) {
					count1 ++;
				}
				else if(num2 == a || num2 ==c) {
						count2 ++;
					}
				else if(num2 != a && num2 !=b && num2 !=c) {
						count3 ++;
					}
				
				if(num3 == c ) {
					count1 ++;
				}
				else if(num3 == b || num3 ==c) {
						count2 ++;
					}
				else if(num3 != a && num3 !=b && num3 !=c) {
						count3 ++;
					}
				
				if(count3 == 3) {
					System.out.println("3out");
				}
				
				
				
			
			System.out.println("Strike: "+count1+" ball: "+count2+" out: "+count3);
		
		}while(answer != sum);
		System.out.println("정답입니다");
			
			
	}

}
