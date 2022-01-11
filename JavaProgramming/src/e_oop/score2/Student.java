package e_oop.score2;

public class Student {
	
	int kor;
	int eng; 
	int math;
	int sum;
	double avg;
	String[] studentName  = { "이단비", "김노을", "정현욱", "박소현", "김수진"
							, "이희현", "강  건", "이민영", "하기재", "이윤우"
							, "김미희", "김혜윤", "신승철", "이광효", "김진혁"
							, "마창수", "양기욱", "이동근", "석기현", "류인성"
							, "이미정", "임나리", "송민섭", "김지윤", "조명석"};
	String name;
	int studentSum;
	double studentAvg;
	
	int rank;

	 //점수를 랜덤으로 만드는 메서드
	void rnadomScore() {
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		math = (int)(Math.random() * 101);
	}
	
	
	int kor() {
		return kor = (int)(Math.random() * 101);
	}
	int eng() {
		return eng = (int)(Math.random() * 101);
	}
	int math() {
		
		return math =  (int)(Math.random() * 101);
	}
	//합계를 구하는 메서드
	int getSum() {
		//가지고있는 값이 있으면 파라미터를 받을 필요가 없다
		sum = kor + eng + math;
		return sum;
	}
	
	
	int studentSum() {
		return studentSum = kor + eng + math;
	}
	//평균을 구하는 메서드
	double getAvg() {
		return avg = Math.round(getSum() / 3.0 * 100) / 100.0;
		
	}
	
	
	double studentAvg() {
		return studentAvg = Math.round(((double)studentSum() / 3) * 100) /100.0 ;
	}
	String name(int i) {
		
			return name = studentName[i];
	}
	//석차를 제공하는 메서드
	int getRank(Student[] students) {
		rank = 1;
		for(int i = 0; i < students.length; i++) {
			if(getSum() < students[i].getSum()) {
				rank++;
			}
		}
		return rank;
	}
	
	
	
	
	
	void setRank(Student[] rk) {
		for(int i = 0;  i < rk.length; i++) {
			rk[i].rank = 1;
			for(int j = 0; j < rk.length; j++) {
				if(rk[i].studentSum < rk[j].studentSum) {
					rk[i].rank++;
				}
			}
		}
	}
	//정보를 제공하는 메서ㄷ
	String getInfo() {
		return name + "\t"  + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + rank; 
	}
	
	
	
}

