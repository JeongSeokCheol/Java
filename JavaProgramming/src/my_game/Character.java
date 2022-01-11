package my_game;

import e_oop.ScanUtil;

public class Character {
	String name;
	int age;
	int fatigue;
	int maxFatigue;
	int money;
	int knowledge;
	int hungry;
	Store[] items;
	
	
	
	Character(String name,int age ,int money ){
		this.name = name;
		this.fatigue = 100;
		this.age = age;
		this.maxFatigue = 100;
		this.money = money;
		this.knowledge = 0;
		this.hungry = 100;
		this.items = new Store[5];
	}
	
	void showState() {
		System.out.println("---------------------------상태--------------------------------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("피곤함 : " + fatigue + " / " + maxFatigue);
		System.out.println("배고픔 : " + hungry + " / " + maxFatigue);
		System.out.println("돈 : " + money);
		System.out.println("지식 : " + knowledge);
		System.out.println("--------------------------------------------------------------");
	}
	
	
	void Check(Action a,Character c) {
		a.Endding(c);
		System.out.println("--------------------------------------------------------------");
		System.out.println("아침이 밝았습니다.");
		System.out.print("1.출석 2.결석  3.학원나가기 >");
		int check = ScanUtil.nextInt();
		switch(check) {
		case 1:a.Attendance(check, c);break;
		case 2:a.Attendance(check, c);c.Check(a, c);break;
		case 3:System.out.println("인생을 종료합니다.");System.exit(0);
		}
	}
		
	
	void GetFatigue(int fatigue) {
		this.fatigue += fatigue;
		System.out.println(fatigue + "의 피로를 회복 하셨습니다.");
		if(100 < this.fatigue){
			this.fatigue = 100;
		}
	}
	void LostFatigue(int fatigue) {
		this.fatigue -= fatigue;
		System.out.println(fatigue + "의 피로를 잃으셨습니다.");
		if ( 0 >= this.fatigue ) {
			this.fatigue = 0;
		}
		
	}
	
	void MinFatigue() {
		System.out.println("피곤하여 출석을 하실 수 없습니다.");
	}
	
	void GetKnowledge(int knowledge) {
		this.knowledge += knowledge;
		System.out.println(knowledge + "의 지식을 얻었습니다.");
		System.out.println("--------------------------------------------------------------");
	}
	
	void LostKnowledge(int konwledge) {
		this.knowledge -= konwledge;
		System.out.println(konwledge + "의 지식을 잃었습니다.");
		System.out.println("--------------------------------------------------------------");
	}
	
	void GetMoney(Action a) {
		if(a.day % 20 == 0) {
			this.money += 300000;
			System.out.println("--------------------------------------------------------------");
			System.out.println("훈련지원금 300,000원이 지급되었습니다.");
		}
	}
	
	void EatFood(Food f) {
		
		if(money < f.price) {
			System.out.println("잔돈이 부족합니다.");
			return; 
		}
		
		money -= f.price;
		
		
		System.out.println("점심으로 " + f + " 먹었습니다.");
		System.out.println("--------------------------------------------------------------");
	}
	void EatKimbob(KimbobCheon ki) {
		
		if(money < ki.price) {
			System.out.println("잔돈이 부족합니다.");
			return; 
		}
		
		money -= ki.price;
		
		
		System.out.println("점심으로 " + ki + " 먹었습니다.");
		System.out.println("--------------------------------------------------------------");
	}

	void EatGS25(GS25 gs) {
	
		if(money < gs.price) {
			System.out.println("잔돈이 부족합니다.");
			return; 
		}
	
		money -= gs.price;
	
	
		System.out.println("점심으로 " + gs + " 먹었습니다.");
		System.out.println("--------------------------------------------------------------");
	}
	
	void Buy(Store s) {
		
		if(money < s.price) {
			System.out.println("잔돈이 부족합니다");
			return;
		}
		
		money -= s.price;
		
		System.out.println(s + "을 구매하셨습니다." );
		System.out.println("--------------------------------------------------------------");
		
		
	}
	
	void GetHungry(int hungry) {
		this.hungry += hungry;
		System.out.println(hungry + "의 배고픔을 회복 하셨습니다.");
		if(100 < this.hungry){
			this.hungry = 100;
		}
		
	}
	
	void LostHungry(int hungry) {
		this.hungry -= hungry;
		System.out.println(hungry + "의 배고픔을 잃으셨니다.");
		if(0 >= this.hungry){
			this.hungry = 0;
		}
	}
	void MinHungry() {
		System.out.println("배고파서 수업에 참여하실 수 없습니다.");
	}
	

	

}
