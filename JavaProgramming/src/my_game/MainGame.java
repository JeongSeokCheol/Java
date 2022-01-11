package my_game;

import e_oop.ScanUtil;

public class MainGame {
	/*
	 * 피로도20이하
	 * 출석 120일 이상 지식점수 1600점 이상
	 * 결석 30번시 강제종료와 함께 수료를 하지 못 한다.
	 * 출석을 해야지 다음 단계로 진행을 할 수있다.
	 * 돈은 10만원이 주어진다.
	 * 피로도가 0이거나 배고픔이 0이면 출석을 하지 못하고 수업도 들을 수 없어 강제 조퇴처리
	 * 수업은 랜덤으로 피로도와 배고픔이 까인다.
	 * 조퇴 횟수가 3회가 되면 결석이 1증가한다.
	 * 4교시가 끝나면 점심시간이 된다.
	 * 점심시간은 도시락,김밥천국,GS25가 있다.
	 * 8교시가 끝나면 자습을 하거나 집에 갈 수 있다.
	 * 집에서는 씻기(피로 -5),자기(피로+20),TV(피로-5),밥먹기(배고픔 +20) 중 랜덤으로 걸립니다.
	 * 미니게임은 3가지의 자바문제가 랜덤으로 나온다.
	 * 자바문제를 객관식은 지식 2와 피로가3회복되고 주관식은 맞춘 수 대로 회복된다. 틀릴경우 똑같은 수만큼 잃는다.
	 * 상점의 이용은 자유롭지만 비싸다.
	 */

	public static void main(String[] args) {
		
				
		System.out.print("이름을 입력하세요 : ");
		String name = ScanUtil.nextLine();
		System.out.print("나이를 입력하세요: ");
		int age = ScanUtil.nextInt();
		
		System.out.println("**************************************************************");
		System.out.println("************************ENDDING의 종류1*************************");
		System.out.println("*1. 출석일수 120일 이상                                                                                     *");
		System.out.println("*2. 지식점수 1600점 이상                                                                                   *");
		System.out.println("************************ENDDING의 종류2*************************");
		System.out.println("*1. 결석일수 30일 이상                                                                                        *");
		System.out.println("**************************************************************");
		
		Character c = new Character(name, age,100000);
		Action a = new Action();
		MiniGame mg = new MiniGame();
		System.out.println("--------------------------------------------------------------");
		System.out.println("대덕 인재 개발원에 오신것을 환영합니다.");
		
		
		while(true) {
			
			c.Check(a, c);
			
			while(a.attendance = true) {
			
			System.out.print("1. 상태  2.수업  3.조퇴  4.현재 일차  5.상점  6.미니게임  7.가방  0.종료  >  ");
			int answer = ScanUtil.nextInt();
			
			switch(answer) {
			case 1: c.showState(); break;
			case 2: a.Lesson(a,c);break;
			case 3: a.Departure(a,c);break;
			case 4: a.ShowDay();break;
			case 5: a.BuyStore(a, c); break;
			case 6: mg.GameStart(c);break;
			case 7: a.ShowBag(a,c);break;
			case 0: 
				System.out.println("수고하셨습니다.");
				System.exit(0);
				
				
					}
			
			   }
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
