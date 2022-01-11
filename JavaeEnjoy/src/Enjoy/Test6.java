package Enjoy;

public class Test6 {

	public static void main(String[] args) {
		String[] students = {"강정윤","고정식","김민경","김민호","김은혜","김재웅","노현정","민진홍","박상진","박상현","박세준","손효선","양동현",
				"양승혁","양앙연","이유정","이응주","이정수","정석철","정지수","조화랑","주찬규","한영민","황부선","김승섭"};
		String[] subject = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		
		int[][] scores = new int[students.length][subject.length];
//		
//		for(int i = 0; i < scores.length; i++) {
//			for(int j = 0; j < scores[i].length; j++) {
//				scores[i][j] = (int)(Math.random() * 101 );
//				
//			}
//		}
//		
		int[] nameSum = new int[scores.length];
		double[] nameAvg = new double[scores.length];
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores.length; j++) {
				nameSum[i] += scores[i][j];
			}
			nameAvg[i] = Math.round((double)nameSum[i] / subject.length * 100) / 100.0;
		}
		
//		int[] subSum = new int[subject.length];
//		double[] subAvg = new double[subject.length];
//		for(int i = 0; i < subject.length; i++) {
//			for(int j = 0; j <scores.length;j++) {
//				subSum[i] += scores[j][i];
//			}
//			subAvg[i] = Math.round((double)subSum[i] / scores.length * 100) / 100.0;
//		}
//		
//		int[] rank = new int[scores.length];
//		for(int i = 0; i < rank.length; i++) {
//			 rank[i] = 1;
//			for(int j =0; j < rank.length;j++) {
//				if(nameSum[i] < nameSum[j]) {
//					 rank[i]++;
//				}
//			}
//		}
//		
//		System.out.print("이름");
//		for(int i = 0; i < subject.length; i++) {
//			System.out.print("\t" + subject[i]);
//		}
//		System.out.println("\t합계\t평균\t석차");
//		for(int i = 0; i < scores.length; i++) {
//			System.out.print(students[i]);
//			for(int j = 0; j < scores[i].length; j++) {
//				System.out.print("\t"+ scores[i][j]);
//			}
//			System.out.println("\t"+ nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
//		}
//		System.out.print("과목 합계:\t");
//		for(int i = 0; i < subSum.length; i++) {
//			System.out.print( subSum[i]+"\t" );
//		}
//		System.out.println();
//		System.out.print("과목 평균:\t");
//		for(int i = 0; i < subSum.length; i++) {
//			System.out.print( subAvg[i]+"\t" );
//		}
		
		
	}

}
