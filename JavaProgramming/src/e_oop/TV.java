package e_oop;

public class TV {
	int ch = 1;
	int vol = 5;
	
	final int MIN_CH = 1; //final이 붙은 변수는 변수의 값을 바꿀수 없게 만든다.(상수라 불린다.) 상수를 만들때는 모두 대문자로 만든다.
	final int MAX_CH = 100;
	final int MIN_VOL = 0; //final이 붙은 변수는 변수의 값을 바꿀수 없게 만든다.(상수라 불린다.) 상수를 만들때는 모두 대문자로 만든다.
	final int MAX_VOL = 10;
	
	boolean power = false;
	
	void power() {
		power = !power;
		System.out.println("TV" + (power ? "ON" : "OFF"));
	}
	
	void changeCh(int ch) {
		if(power) {
			if(MIN_CH <= ch && ch <= MAX_CH) {
				this.ch = ch;
			}
			System.out.println("채널 . " + this.ch);
		}
	}
	
	void chUp() {
		int ch = 0;
		if(ch == MAX_CH) {
			ch = MIN_CH;
		}
		else {
			ch = ch+1;
		}
		changeCh(ch);
	}
	
	void chDown() {
		changeCh(ch - 1);
	}
	
	void volUp() {
		if(power) {
			if(ch < MAX_VOL) {
				vol++;
			}
			showVol();
		}
	}
	
	void showVol() {
		System.out.println("음량. ");
		for(int i = MIN_VOL +1; i <= MAX_VOL; i++) {
			if(i <= vol) {
				System.out.print("●");
			}
			else {
				System.out.print("○");
			}
			
		}
		System.out.println();
		
	}
	
	void volDown() {
		if(power) {
			if(MIN_VOL < vol) {
				vol--;
			}
			showVol();
		}
	}
	
	
//	void chUp() {
//		if(ch > MAX_CH) {
//			ch = 1;
//			System.out.println("현재 채널 : " + ch);
//		}
//		else{
//			ch++;
//			System.out.println("현재 채널 : " +ch);
//		}
//	}
//	
//	void chDown() {
//		if(ch < MIN_CH) {
//			ch = 9;
//			System.out.println("현재 채널 : " +ch);
//		}
//		else {
//			ch--;
//			System.out.println("현재 채널 : " +ch);
//		}
//	}
//	
//	void getCh() {
//		System.out.print("몇번으로 가시겠습니까? ");
//		ch = ScanUtil.nextInt();
//		if(ch > MAX_CH) {
//			ch = 1;
//			System.out.println("채널을 초과하셨습니다.");	
//			System.out.println("현재 채널 : " +ch);
//		}
//		if(ch < MIN_CH) {
//			ch = 9;
//			System.out.println("채널이 없습니다.");
//			System.out.println("현재 채널 : " +ch);
//		}
//		
//	}
//	
//	void volUp() {
//		if(vol > MAX_VOL) {
//			System.out.print("볼륨 최대입니다. ");
//			System.out.println("현재 볼륨 : " + vol);
//		}
//		else {
//			vol++;
//			System.out.println("현재 볼륨 : " + vol);
//		}
//	}
//	void volDown() {
//		if(vol < MIN_VOL) {
//			System.out.print("볼륨 최소입니다. ");
//			System.out.println("현재 볼륨 : " + vol);
//		}
//		else {
//			vol--;
//			System.out.println("현재 볼륨 : " + vol);
//		}
//	}
	
	
	
	
	public static void main(String[] args) {
				TV tv = new TV();
				while(true) {
					System.out.println("1.전원 2.채널변경 3.채널+ 4.채널-");
					System.out.print("5.볼륨+ 6.볼륨 - 0.종료 > ");
					int  input = ScanUtil.nextInt();
					switch(input) {
					case 1: tv.power(); break;
					case 2:
						System.out.print("변경할 채널(1~100) > ");
						int ch = ScanUtil.nextInt();
						tv.changeCh(ch);
						break;
					case 3: tv.chUp(); break;
					case 4: tv.chDown(); break;
					case 5: tv.volUp(); break;
					case 6: tv.volDown(); break;
					case 0: 
						System.out.println("프로그램이 종료되었습니다.");
						System.exit(0);
					}
				}
				
				
				
				
//				tv.power();
//				if(tv.power == true) {
//					while(tv.power == true) {
//						System.out.println("=============================================================");
//						System.out.print("1.chUp  2.chDown  3.chGet  4.volUp 5.volDown 0.turnOff  >  ");
//						int menu = ScanUtil.nextInt();
//						if(menu == 1) {
//							tv.chUp();
//						}
//						if(menu == 2) {
//							tv.chDown();
//						}
//						if(menu == 3) {
//							tv.getCh();
//							
//
//						}
//						if(menu == 4) {
//							tv.volUp();
//							
//			
//						}
//						if(menu == 5) {
//							tv.volDown();
//						}
//						if(menu == 0) {
//							tv.power();
//						}
//		
//					if(tv.power == false) {
//						System.out.println("=============================================================");
//						System.out.println("TV를 다시키시겠습니까?(y,n) > ");
//						String answer = ScanUtil.nextLine();
//						if(answer.equals("y")){
//							tv.power();
//						}
//						else {
//							System.out.println("수고하셨습니다.");
//							}
//					}
//		
//				}
//	
//			}
	

	}
}
