package my_game;


import e_oop.ScanUtil;

public class Action {
	
	int lesson; //수업
	int sleep; //잠
	int preparation;  //자습
	int eat; //식사
	int count ; //횟수
	String name;
	int price;
	int day = 1;
	int random;
	boolean attendance = false;// 출석
	int attendanceCount = 0;
	int absentCount = 0;
	boolean departure = false;//조퇴
	int departureCount = 0;
	
	int[] foodcount = new int[5];
	int kycount = 0;
	
	
	Store[] items = new Store[5];
	

	LunchBox lb = new LunchBox();
	Ramen r = new Ramen();
	Jeyuk j = new Jeyuk();
	Kimbob k = new Kimbob();
	Samkok sa = new Samkok();
	Gogi go = new Gogi();
	CupRamen cr = new CupRamen();
	Keybord ky = new Keybord();
	Gum gu = new Gum();
	Candy ca = new Candy();
	Coke co = new Coke();
	Vita500 vi = new Vita500();
	
	void Random() {
		random = (int)(Math.random() * 5) + 1;
	}
	
	
	void Attendance(int check,Character c) {
		if(c.fatigue > 0) {
			if(check ==1) {
				attendance = !attendance;
				System.out.println(day + "일차 출석");
				System.out.println("--------------------------------------------------------------");
				attendanceCount ++;
				count = 0;
		}
			else if(check==2) {
				attendance = false;
				System.out.println(day + "일차 결석");
				System.out.println("--------------------------------------------------------------");
				c.GetFatigue(20);
				absentCount++;
				count = 0;
				day++;
			}
		}
		
		if(c.fatigue < 20) {
			c.MinFatigue();
			attendance = false;
			absentCount++;
			day++;
		}
	}
	
	void Departure(Action a,Character c) {
		departure = !departure;
		System.out.println("조퇴 하셨습니다.");
		System.out.println("--------------------------------------------------------------");
		departureCount++;
		if(departureCount == 3) {
			departureCount = 0;
			absentCount++;
		}
		count =0;
		c.GetFatigue(10);
		day++;
		GoHome(c);
		c.Check(a, c);
		
		
	}
	
	void Oracle(Action a,Character c) {
		if(c.fatigue > 0 || c.hungry > 0) {
			System.out.println(this.count + 1 + " 교시" +" Oracle수업이 끝났습니다.");
			a.Random();
			c.LostFatigue(random);
			this.count++;
			a.Random();
			c.LostHungry(random);
			a.Random();
			c.GetKnowledge(random);
			
			if(count == 4) {
				a.EatLunch(a, c);
			}
			if(count >= 8) {
				System.out.println("수업이 끝났습니다.");
				System.out.println("--------------------------------------------------------------");
				System.out.print("1. 자습 2. 퇴실 > ");
				int end = ScanUtil.nextInt();
			
				switch(end) {
				case 1: preparation(c);break;
				case 2: GoHome(c);break;
				}
				count = 0;
				day++;
				c.Check(a, c);
			}
				c.GetMoney(a);
		}
		
		if(c.fatigue <= 0) {
			c.MinFatigue();
			a.Departure(a, c);
		}
		if(c.hungry <= 0) {
			c.MinHungry();
			a.Departure(a, c);
		}
	}
	
	void Java(Action a,Character c) {
		if(c.fatigue > 0 || c.hungry > 0) {
			System.out.println(this.count + 1 + " 교시" +" JAVA수업이 끝났습니다.");
			a.Random();
			c.LostFatigue(random);
			this.count++;
			a.Random();
			c.LostHungry(random);
			a.Random();
			c.GetKnowledge(random);
			if(count == 4) {
				a.EatLunch(a, c);
			}
			if(count >= 8) {
				System.out.println("수업이 끝났습니다.");
				System.out.println("--------------------------------------------------------------");
				System.out.print("1. 자습 2. 퇴실 > ");
				int end = ScanUtil.nextInt();
			
				switch(end) {
				case 1: preparation(c);break;
				case 2: GoHome(c);break;
				}
				count = 0;
				day++;
				c.Check(a, c);
			}
				c.GetMoney(a);
		}
		
		if(c.fatigue <= 0 ) {
			c.MinFatigue();
			a.Departure(a, c);
		}
		if(c.hungry <= 0) {
			c.MinHungry();
			a.Departure(a, c);
		}
	}
	
	void Lesson(Action a,Character c) {
		if(attendance) {
			System.out.println("--------------------------------------------------------------");
			System.out.print("1.Oracle 2.JAVA > ");
			int cs = ScanUtil.nextInt();
			switch(cs) {
			case 1: a.Oracle(a,c);break;
			case 2: a.Java(a,c);break;
			}
		}
	}

		
		
	
	
	void ShowDay() {
	
		System.out.print("현재 일차: " + day + " / 150 ");
		System.out.print("\t출석: " + attendanceCount);
		System.out.print("\t결석: " + absentCount);
		System.out.println("\t조퇴: " + departureCount);
		System.out.println("--------------------------------------------------------------");
		
	}
	
	void Sleep(Character c) {
		System.out.println("잠을 잤습니다.");
		c.GetFatigue(20);
		
		
	}
	
	void Wash(Character c) {
		System.out.println("씻었습니다.");
		c.LostFatigue(5);
	}
	
	void TV(Character c) {
		System.out.println("TV를 봤습니다.");
		c.LostFatigue(10);
	}
	void EatDinner(Character c) {
		System.out.println("저녁을 먹었습니다.");
		c.GetHungry(20);
	}
	
	void preparation(Character c) {
		System.out.println("야간자습을 합니다.");
		c.LostFatigue(20);
		c.GetKnowledge(5);
		GoHome(c);
	}
	
	void GoHome(Character c) {
		System.out.println("집에 왔습니다.");
		int home = (int)(Math.random()*4)+1;
	
		switch(home) {
		case 1: Wash(c);break;
		case 2: TV(c); break;
		case 3: Sleep(c);break;
		case 4: EatDinner(c);break;
		}
		System.out.println("--------------------------------------------------------------");
	}
	
	void EatLunch(Action a, Character c) {
		System.out.println("점심시간입니다.");
		System.out.print("1.도시락(3500원) 2.김밥천국  3.GS25 4.안먹을래> ");
		int lunch = ScanUtil.nextInt();
		switch(lunch) {
		case 1: c.EatFood(lb); a.EatFood(lb, c);break;
		case 2:	a.EatLunchKimbob(a, c);break;
		case 3: a.EatGS25(a, c);
		case 4:break;
			
		}
	}
	
	void EatFood(Food f,Character c) {
		if(f.name.equals("도시락")) {
			c.GetFatigue(5);
			c.GetHungry(30);
		}
	
	}
	void EatLunchKimbob(Action a, Character c) {
		System.out.print("1.제육덮밥(6000원) 2.김밥(2500원) 3.라면(3500원) 4.안먹어> ");
		int kimbobcheon = ScanUtil.nextInt();
		switch(kimbobcheon) {
		case 1:c.EatKimbob(j); a.EatKimbob(j, c);break;
		case 2:c.EatKimbob(k); a.EatKimbob(k, c);break;
		case 3:c.EatKimbob(r); a.EatKimbob(r, c);break;
		case 4:break;
		}
	}
	
	void EatGS25(Action a, Character c) {
		System.out.print("1.불고기도시락(4500원) 2.삼각김밥(1200원) 3.컵라면(1500원) 4.안먹어> ");
		int gs25 = ScanUtil.nextInt();
		switch(gs25) {
		case 1:c.EatGS25(go); a.EatGS25(go, c); break;
		case 2:c.EatGS25(sa); a.EatGS25(sa, c); break;
		case 3:c.EatGS25(cr); a.EatGS25(cr, c); break;
		case 4:break;
		}
	}
	
	void EatGS25(GS25 gs, Character c) {
		if(gs.name.equals("불고기도시락")) {
			c.GetFatigue(10);
			c.GetHungry(20);
		}
		if(gs.name.equals("삼각김밥")) {
			c.GetFatigue(3);
			c.GetHungry(5);
		}
		if(gs.name.equals("컵라면")) {
			c.GetFatigue(5);
			c.GetHungry(10);
		}
	}
	
	void EatKimbob(KimbobCheon ki , Character c) {
		if(ki.name.equals("제육덮밥")) {
			c.GetFatigue(10);
			c.GetHungry(30);
		}
		if(ki.name.equals("김밥")) {
			c.GetFatigue(3);
			c.GetHungry(10);
		}
		if(ki.name.equals("라면")) {
			c.GetFatigue(5);
			c.GetHungry(5);
		}
	}
	
	void BuyStore(Action a, Character c) {
		System.out.print("1.껌(7000원) 2.사탕(5000원) 3.콜라(15000원)  4.비타500(13000원)  0.그만해그만> ");
		int store = ScanUtil.nextInt();
		switch(store) {
		case 1:{c.Buy(gu); a.GetBag(gu,c);break;}
		case 2:{c.Buy(ca); a.GetBag(ca,c);break;}
		case 3:{c.Buy(co); a.GetBag(co,c);break;}
		case 4:{c.Buy(vi); a.GetBag(vi,c);break;}
		case 0:break;
		}
	}
	
	void Buy(Store s, Character c) {
		if(s.name.equals("껌")) {
			c.GetFatigue(1);
			c.GetHungry(1);
		}
		if(s.name.equals("사탕")) {
			c.GetFatigue(2);
			c.GetHungry(2);
		}
		if(s.name.equals("콜라")) {
			c.GetFatigue(5);
			c.GetHungry(2);
		}
		if(s.name.equals("비타500")) {
			c.GetFatigue(20);
		}
	}
	
	
	void GetBag(Store s,Character c) {
		if(c.money > s.price) {
			
			if(s == gu) {
				foodcount[1] ++;
			}
			if(s == ca) {
				foodcount[2] ++;
			}
			if(s == co){
				foodcount[3] ++;
			}
			if(s == vi) {
				foodcount[4] ++;
			}
		}
	}
	
	void ShowBag(Action a, Character c) {
		System.out.println("1. 껌 : " + foodcount[1]);
		System.out.println("2. 사탕 : " + foodcount[2]);
		System.out.println("3. 콜라 : " + foodcount[3]);
		System.out.println("4. 비타500 : " + foodcount[4]);
		
		a.UseBag(a, c);
	}
	
	void UseBag(Action a,Character c) {
		
			System.out.print("무엇을 사용하시겠습니까? (0 : 나가기)> ");
			int answer = ScanUtil.nextInt();
					switch(answer) {
					case 0: break; 
					case 1: 
						if(foodcount[1] > 0) {
						a.Buy(gu, c);foodcount[1]--;break;
					}else{
						System.out.println("물건이 없습니다.");break;
					}
					case 2:
						if(foodcount[2] > 0) {
							a.Buy(ca, c);foodcount[2]--;break;
						}else{
							System.out.println("물건이 없습니다.");break;
						}
					case 3: 
						if(foodcount[3] > 0) {
							a.Buy(co, c);foodcount[3]--;break;
						}else{
							System.out.println("물건이 없습니다.");break;
						}
					case 4: 
						if(foodcount[4] > 0) {
							a.Buy(vi, c);foodcount[4]--;break;
						}else{
							System.out.println("물건이 없습니다.");break;
						}
					}
					System.out.println("--------------------------------------------------------------");
				}

	
	
	
	
	void Endding(Character c) {
		if(day >= 120 || c.knowledge > 1600) {
			System.out.println("수료하셨습니다.");
			System.exit(0);
		}
		if(absentCount >= 30) {
			System.out.println("수료하지 못하셨습니다.");
			System.exit(0);
		}
		
	}
	

			
	
	

}
