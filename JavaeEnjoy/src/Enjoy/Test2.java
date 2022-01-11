package Enjoy;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args){
		int num = 0;
		
		System.out.print("몇단의 구구단을 원합니까? > ");
		Scanner s = new Scanner(System.in);
		num = Integer.parseInt(s.nextLine());
		for(int i = num; i == num ; i++) {
			
			for(int j = 1; j<10; j++){
				 
				 System.out.println(""+i+"*"+""+j+"="+i*j);
			}
			System.out.println();
		}
	}

}
