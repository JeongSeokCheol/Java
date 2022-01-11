package my_game;

import e_oop.ScanUtil;

public class MiniGame {
	
	String[] game = {"자바 배열" , "자바 For문" , "자바 반복문"};
	String quest ;
	int a;
	public static final String RESET = "\u001B[0m";
	public static final String FONT_RED = "\u001B[31m"; 
	
	
	
	void GameStart(Character c) {
		if(c.fatigue > 50) {
		a = (int)(Math.random()*3);
		quest = game[a];
		switch(a) {
		case 0: JavaArray(c); break;
		case 1: JavaFor(c); break;
		case 2: JavaType(c); break;
			}
		}
		else {
			System.out.println("피로도 50 이하입니다.");
			System.out.println("--------------------------------------------------------------");
		}


	}
	
	
	void JavaArray(Character c) {
		
			System.out.println(quest+" 문제 다음중 틀린 것을 고르시오");
			System.out.println("1.여러개의 값을 하나의 변수에 저장해서 사용하는 것이다. \n2.참조형 타입이다. \n3.길이를 변경할 수 있다. \n4.인덱스로 값을 구분한다. ");
			System.out.print("정답 : ");
			int answer = ScanUtil.nextInt();
			switch(answer) {
			case 1: c.LostFatigue(3);c.LostKnowledge(2); break;
			case 2: c.LostFatigue(3);c.LostKnowledge(2); break;
			case 3: c.GetFatigue(3);c.GetKnowledge(2); break;
			case 4: c.LostFatigue(3);c.LostKnowledge(2); break;
			}	
	}
	
	
	void JavaFor(Character c) {
		int count = 0;
		int discount = 0;
		System.out.println(quest+" 문제 다음의 문장 빈칸에 들어갈 알맞은 것을 차례대로 쓰시오. ");
		System.out.println("\r\nint[][] score = new int[25][7];\r\n" + 
				"		\r\n" + 
				"		int[] sum = new int[25];\r\n" + 
				"		double[] avg = new double[25];\r\n" + 
				"		int[] count = new int[score.length];\r\n" + 
				"		int[] sum1 = new int[score.length];\r\n" + 
				"		double[] avg1 = new double[score.length];\r\n"+
				"			for(int i = 0; i < (1)      ; i++) {\r\n" + 
				"				for(int j = 0; j < (2)    ; j++) {\r\n" + 
				"					score[i][j] = (int)(Math.random()*101);\r\n" + 
				"					sum[i] += (3)    ;\r\n" + 
				"					\r\n" + 
				"				}\r\n" + 
				"				\r\n" + 
				"					"
				+ "-+avg[i] = (double)sum[i] / score[i].length;\r\n" + 
				"							\r\n" + 
				"		}");
		System.out.print("정답(1) : ");
		String answer1 = ScanUtil.nextLine();
		System.out.print("정답(2) : ");
		String answer2 = ScanUtil.nextLine();
		System.out.print("정답(3) : ");
		String answer3 = ScanUtil.nextLine();
		
		if(answer1.equals("score.length")) {
			count ++;
			}
		else {
			discount ++;
		}
		
		if(answer2.equals("score[i].length")) {
			count ++;
		}
		else {
			discount ++;
		}
		
		if(answer3.equals("score[i][j]")) {
			count ++;
		}
		else {
			discount ++;
		}
		
		
		System.out.println("정답수 : " + count);
		if(count > 0) {
			c.GetFatigue(count);
			c.GetKnowledge(count);
		}
		else {
			c.LostFatigue(discount);
			c.LostKnowledge(discount);
		}
		
	}
	
	void JavaType(Character c) {
		System.out.println(quest+" 문제 다음 JAVA에서 정수형이 아닌 것을 고르시오. ");
		System.out.println("1. int \n2. double \n3.long \n4.short");
		System.out.print("정답 : ");
		int answer = ScanUtil.nextInt();
		switch(answer) {
		case 1: c.LostFatigue(3);c.LostKnowledge(2); break;
		case 3: c.LostFatigue(3);c.LostKnowledge(2); break;
		case 2: c.GetFatigue(3);c.GetKnowledge(2); break;
		case 4: c.LostFatigue(3);c.LostKnowledge(2); break;
		}	
	}
	
	
	
	
}
