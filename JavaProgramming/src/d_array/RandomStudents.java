package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {
		//1~25사이의 숫자를 입력 받아 n명을 랜덤으로 뽑는다.
		//뽑힌사람이 중복되면 안 된다.
//		String[] member = {"강정윤","고정식","김민경","김민호","김은혜","김재웅","노현정","민진홍","박상진","박상현","박세준","손효선","양동현",
//							"양승혁","양앙연","이유정","이응주","이정수","정석철","정지수","조화랑","주찬규","한영민","황부선","김승섭 선생님"};
//		int num = 0;
//		
//			Scanner s = new Scanner(System.in);
//			System.out.print("몇명을 뽑으시겠습니까?(1~25명)> ");
//			num = Integer.parseInt(s.nextLine());
//			
//			
//			for(int i = 0; i < member.length; i++) {
//				int people = (int)(Math.random() * 25);
//				String save = member[0];
//				member[0] = member[people];
//				member[people] = save;
//				}
//			
//		for(int j = 0; j < num; j++) {		
//			System.out.println(j+1 +"번 학생: " + member[j]);
//		}
		
		String[] students = {"강정윤","고정식","김민경","김민호","김은혜","김재웅","노현정","민진홍","박상진","박상현","박세준","손효선","양동현",
					"양승혁","양앙연","이유정","이응주","이정수","정석철","정지수","조화랑","주찬규","한영민","황부선","김승섭 선생님"};
		
		Scanner s = new Scanner(System.in);
		System.out.print("몇명 뽑을까요? ");
		int count  = Integer.parseInt(s.nextLine());
		
		String[] pick = new String[count];
		int pickCount = 0;
		
		do {
			int random = (int)(Math.random()*students.length);
			
			boolean flag = true;
			for(int i = 0; i< pick.length; i++) {
				if(students[random].equals(pick[i])){
					flag = false;
				}
			}
			if(flag) {
				pick[pickCount++] = students[random];
			}
		}while(pickCount < count);

		System.out.println(Arrays.toString(pick));
		
		
		
	}

}
