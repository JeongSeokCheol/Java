package j_collection;

import java.util.ArrayList;

public class Score_Sem {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0 ~ 100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 이름		국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */
		
		ArrayList<String> students = new ArrayList<>();
		students.add("민진홍");
		students.add("노현정");
		students.add("박상진");
		
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("국어");
		subjects.add("영어");
		subjects.add("수학");
		subjects.add("사회");
		subjects.add("과학");
		subjects.add("Oracle");
		subjects.add("Java");
		
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
		ArrayList<Integer> sums = new ArrayList<>();
		ArrayList<Double> avgs = new ArrayList<>();
		ArrayList<Integer> ranks = new ArrayList<>();
		ArrayList<Integer> subSums = new ArrayList<>();
		ArrayList<Double> subAvgs = new ArrayList<>();
		
		//점수 발생
		for(int i = 0; i < students.size(); i++) {
			ranks.add(1);
			ArrayList<Integer> score = new ArrayList<>();
			for(int j = 0; j < subjects.size(); j++) {
				score.add((int)(Math.random() * 101));
			}
			scores.add(score);
		}
		
		//합계,평균
		for(int i = 0; i < scores.size(); i++) {
			int sum = 0;
			for(int j = 0; j < scores.get(i).size(); j++) {
				sum += scores.get(i).get(j);
			}
			sums.add(sum);
			avgs.add(Math.round((double)sum / scores.get(i).size() * 100) / 100.0);
		}
		
		//석차
		for(int i = 0; i < sums.size(); i++) {
			for(int j = 0; j < sums.size(); j++) {
				if(sums.get(i) < sums.get(j)) {
					ranks.set(i, ranks.get(i) + 1);
				}
			}
		}
		
		//정렬
		for(int i = 0; i < ranks.size(); i++) {
			int min = i;
			for(int j = i + 1; j < ranks.size(); j++) {
				if(ranks.get(j) < ranks.get(min)) {
					min = j;
				}
			}
			
			students.set(i, students.set(min, students.get(i)));
			scores.set(i, scores.set(min, scores.get(i)));
			sums.set(i, sums.set(min, sums.get(i)));
			avgs.set(i, avgs.set(min, avgs.get(i)));
			ranks.set(i, ranks.set(min, ranks.get(i)));
		}
		
		//과목별
		for(int i = 0; i < subjects.size(); i++) {
			int sum = 0;
			for(int j = 0; j < students.size(); j++) {
				sum += scores.get(j).get(i);
			}
			subSums.add(sum);
			subAvgs.add(Math.round((double)sum / students.size() * 100) / 100.0);
		}
		
		System.out.println("==================================================");
		System.out.print("이름");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t합계\t평균\t석차");
		System.out.println("--------------------------------------------------");
		for(int i = 0; i < scores.size(); i++) {
			System.out.print(students.get(i));
			for(int j = 0; j < scores.get(i).size(); j++) {
				System.out.print("\t" + scores.get(i).get(j));
			}
			System.out.println("\t" + sums.get(i) + "\t" + avgs.get(i) + "\t" + ranks.get(i));
		}
		System.out.println("--------------------------------------------------");
		System.out.print("과목합계");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subSums.get(i));
		}
		System.out.print("\n과목평균");
		for(int i = 0; i < subjects.size(); i++) {
			System.out.print("\t" + subAvgs.get(i));
		}
		System.out.println();
		System.out.println("==================================================");
	}

}













