package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를 
		 * 0 ~ 100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요
		 * 이름		국어		영어		수학		사회		과학		Oracle		java		합계		평균		석차
		 *박상진		90		90		90		90		90		90			90			630		90		1
		 *이정수		90		90		90		90		90		90			90			630		90		1
		 *노현정		90		90		90		90		90		90			90			630		90		1
		 *정지수		90		90		90		90		90		90			90			630		90		1
		 *양동현		90		90		90		90		90		90			90			630		90		1
		 *과목 합계       450		450		450		450		450		450			450
		 *과목평균	90.00	90.00	90.00	90.00	90.00	90.00		90.00
		 */
		String[] students = {"강정윤","고정식","김민경","김민호","김은혜","김재웅","노현정","민진홍","박상진","박상현","박세준","손효선","양동현",
				"양승혁","양앙연","이유정","이응주","이정수","정석철","정지수","조화랑","주찬규","한영민","황부선","김승섭"};
		System.out.println("이름" + "\t국어"+"\t영어" + "\t수학" + "\t사회" +"\t과학" +"\tOracle" + "\tJava" + "\t합계" + "\t평균" + "\t석차");
		int[][] score = new int[25][7];

		int[] sum = new int[25];
		double[] avg = new double[25];
		int[] count = new int[score.length];
		int[] sum1 = new int[score.length];
		double[] avg1 = new double[score.length];
		
		
		for(int i = 0; i < count.length; i++) {
			count[i] = 1;
		}		
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = (int)(Math.random()*101);
				sum[i] += score[i][j];
				
			}
			
			avg[i] = (double)sum[i] / score[i].length;
						
	
		}
		
		
		
		for(int i = 0;i < count.length; i++) {
			for(int j = 0; j < count.length; j++) {
				if(sum[i] < sum[j]) {
					count[i]++;
				}
			}
		}
		
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(students[i]);
			for(int j = 0; j < score[i].length; j++) {

				System.out.print("\t"+ score[i][j]);
			}
			
			
			System.out.print("\t"+ sum[i]);
			System.out.print("\t"+ avg[i]);
			System.out.print("\t"+ count[i]);
			System.out.println();	
			
		}
		

	}

}
