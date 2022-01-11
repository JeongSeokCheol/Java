package j_collection;

import java.util.ArrayList;

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
		
		String[] names = {"강정윤","고정식","김민경","김민호","김은혜","김재웅","노현정","민진홍","박상진","박상현","박세준","손효선","양동현",
				"양승혁","양앙연","이유정","이응주","이정수","정석철","정지수","조화랑","주찬규","한영민","황부선","김승섭"};
		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		
		ArrayList<String> student = new ArrayList<>();
		ArrayList<String> subject = new ArrayList<>();
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
		
		for(int i = 0; i < names.length; i++) {
			student.add(names[i]);
		}
		
		for(int i =0; i < subjects.length; i++) {
			subject.add(subjects[i]);
		}
		
		for(int i = 0; i < student.size(); i++) {
			ArrayList<Integer> score = new ArrayList<>();
			for (int j = 0; j < subject.size(); j++) {
				score.add((int)(Math.random()*101));
			}
			scores.add(score);

		}
		
		//학생의 합계와 평균
		ArrayList<Integer> nameSum = new ArrayList<>();
		ArrayList<Double> nameAvg = new ArrayList<>();
		int sum = 0;
		
		for(int i = 0; i < scores.size(); i++) {
			sum = 0;
			for(int j = 0; j <subject.size(); j++) {
				sum += scores.get(i).get(j);
			}
			nameSum.add(sum);
			nameAvg.add(Math.round((double)sum/subject.size()*100)/100.0);
			}
				
		//과목의 합계와 평균
		ArrayList<Integer> subSum = new ArrayList<>();
		ArrayList<Double> subAvg = new ArrayList<>();
		for(int i = 0; i < subject.size(); i++) {
			sum=0;
			for(int j = 0; j < scores.size(); j++) {
				sum += scores.get(j).get(i);
			}
			subSum.add(sum);
			subAvg.add(Math.round((double)sum/scores.size()*100)/100.0);
			
		}
		//석차 구하기
		ArrayList<Integer> rank = new ArrayList<>();
		for(int i = 0; i < nameSum.size(); i ++) {
			rank.add(1);
			for(int j = 0 ; j < nameSum.size(); j++) {
			if(nameSum.get(i) < nameSum.get(j)) {
				rank.set(i, rank.get(i)+1);

				}
			}
		}
		//석차 정렬
		for(int i = 0; i < rank.size() - 1; i ++) {
			int min = i;
			for(int j = i + 1 ; j < rank.size() ; j++) {
				if(rank.get(min) > rank.get(j)) {
					min = j;
				}
			}
			rank.set(i,rank.set(min,rank.get(i)));
			scores.set(i,scores.set(min, scores.get(i)));
			nameSum.set(i,nameSum.set(min,nameSum.get(i)));
			nameAvg.set(i,nameAvg.set(min, nameAvg.get(i)));
			student.set(i,student.set(min,student.get(i)));
		}
		
		
		System.out.print("이름");
		for(int i = 0; i < subject.size(); i++) {
			System.out.print("\t"+subject.get(i));
		}
		System.out.println("\t합계\t평균\t석차");
		 
		for(int i = 0 ; i < scores.size(); i++) {
		System.out.print(student.get(i));
		ArrayList<Integer> score = scores.get(i);
			for(int j = 0; j < score.size(); j++) {
				System.out.print("\t"+scores.get(i).get(j));
			}
			System.out.println("\t" + nameSum.get(i) + "\t" + nameAvg.get(i) + "\t" + rank.get(i));
			
		}
		System.out.print("과목합계");
		for(int i = 0 ; i < subject.size(); i++) {
			System.out.print("\t" + subSum.get(i));
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0; i < subject.size(); i++) {
			System.out.print("\t" + subAvg.get(i));
		}
		
		
		
		

		
		
		
		
		
		
		
	}

}
