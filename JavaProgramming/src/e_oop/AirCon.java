package e_oop;

public class AirCon {
	int temp = 20;
	int mode;
	int wind = 2;
	
	
	final int MAX_TEMP = 30;
	final int MIN_TEMP = 18;
	final int MAX_WIND = 5;
	final int MIN_WIND = 1;
	
	boolean power = false;
	
	void power() {
		power = !power;
		System.out.println("AirCon" + (power ? "ON" : "OFF"));
		
	}
	
	void tempUp() {
		if(power) {
		if(temp < MAX_TEMP) {
			temp ++;
			System.out.println("현재온도 : "+ temp);
		}
		else {
			temp = MAX_TEMP;
			System.out.println("현재온도 : "+ temp);
		}
		}
	}
	
	void tempDown() {
		if(power) {
			if(temp > MIN_TEMP) {
				temp --;
				System.out.println("현재온도 : "+ temp);
			}
			else {
				temp = MIN_TEMP;
				System.out.println("현재온도 : "+ temp);
			}
		}
	}
	
	void mode(int mode) {
		if(power) {
			this.mode = mode;
			if(mode == 1) {
				System.out.print("현재모드: 냉방\t");
			}
			if(mode == 2) {
				System.out.print("현재모드: 난방\t");
			}
			if(mode == 3) {
				System.out.println("터보로 설정 되었습니다.");
				temp = 16;
				System.out.println("현재온도 : "+ temp);
				if(temp >= 16) {
					temp = 17;
					this.mode = 1;
				}
			}
		}
	}
	
	void windUP() {
		if(power) {
			if(wind < MAX_WIND) {
				wind++;
			}
			showWind();
		}
	}
	void windDown() {
		if(power) {
			if(wind > MIN_WIND) {
				wind--;
			}
			showWind();
		}
	}
	
	void showWind() {
		System.out.print("바람의 세기:");
		if(power) {
			for(int i = MIN_WIND; i <= MAX_WIND; i++) {
				if(i <= wind) {
					System.out.print("■ ");
				}
				else {
					System.out.print(" □");
				}
				
			}
			System.out.println();
		}
		
	}

	
	
	
	
	
	public static void main(String[] args) {
		
		AirCon ac = new AirCon();
		ac.mode = 1;
		while(true) {
			
			System.out.print("1. 전원  2.온도+ 3.온도- 4.바람세기+ 5.바람세기- 6.mode 0.종료 > ");
			int i = ScanUtil.nextInt();
			switch(i) {
			case 1: ac.mode(ac.mode);ac.power();break;
			case 2: ac.mode(ac.mode);ac.tempUp();break;
			case 3: ac.mode(ac.mode);ac.tempDown();break;
			case 4: ac.windUP();break;
			case 5: ac.windDown(); break;
			case 6: 
				System.out.print("1.냉방 2.난방 3.터보 > ");
				int mode = ScanUtil.nextInt();
				ac.mode(mode); break;
			case 0: 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			
			
			
			
			}
			
		
		
		
		
		}
	}
	
	
}
