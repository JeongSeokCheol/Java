package e_oop;

public class Television {

	public static void main(String[] args) {
		TV tv = new TV();
			tv.power();
		
		do {

			System.out.print("1.chUp  2.chDown  3.chGet  4.volUp 5.volDown 0.turnOff ");
			int menu = ScanUtil.nextInt();
			if(menu == 1) {
				tv.chUp();
				System.out.println("현재 채널 : " + tv.ch);
			}
			if(menu == 2) {
				tv.chDown();
				System.out.println("현재 채널 : " + tv.ch);
			}
			if(menu == 3) {
//				tv.getCh();
				System.out.println("현재 채널 : " + tv.ch);
			}
			if(menu == 4) {
				tv.volUp();
				System.out.println("현재 볼륨 : " + tv.vol);
			}
			if(menu == 5) {
				tv.volDown();
				System.out.println("현재 볼륨 : " + tv.vol);
			}
			if(menu == 0) {
				tv.power();
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		
		
		
		
		
		
		}while(tv.power == true);
	}

}
