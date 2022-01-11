package Enjoy;

public class Test7 {

	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i=0; i< ballArr.length;i++) {
		int j = (int)(Math.random() * ballArr.length);
		int tmp = 0;
		/*
		(1) . 알맞은 코드를 넣어 완성하시오
		*/
		tmp = ballArr[i];
		ballArr[i] = ballArr[j];
		ballArr[j] = tmp;
			
			
		}
		
		/* (2) */
//		for(int i = 0 ;  i <ball3.length; i++) {
//			ball3[i] = ballArr[i];
//		}
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		for(int i=0;i<ball3.length;i++) {
		System.out.print(ball3[i]);
		}
	}

}
