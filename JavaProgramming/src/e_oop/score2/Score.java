package e_oop.score2;

public class Score {

	public static void main(String[] args) {
		String[] studentNames = { "이단비", "김노을", "정현욱", "박소현", "김수진"
				, "이희현", "강  건", "이민영", "하기재", "이윤우"
				, "김미희", "김혜윤", "신승철", "이광효", "김진혁"
				, "마창수", "양기욱", "이동근", "석기현", "류인성"
				, "이미정", "임나리", "송민섭", "김지윤", "조명석"};
		Student[] students = new Student[studentNames.length];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			
			students[i].name = studentNames[i];
			students[i].rnadomScore();
			students[i].getSum();
			students[i].getAvg();
	
		}
	
		//석차
		for(int i = 0; i < students.length; i++) {
			students[i].getRank(students);
		}
		//정렬
		for(int i = 0; i < students.length - 1; i++){
			int max = i;
			for(int j = i + 1; j < students.length; j++){
				if(students[j].getSum() > students[max].getSum()){
					max = j;
				}
			}
			Student temp = students[i];
			students[i] = students[max];
			students[max] = temp;
		}
		//출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++){
			System.out.println(students[i].getInfo());
				}
				
		//과목 합계
		int[] sums = new int[3];
		for(int i = 0; i < students.length; i++) {
			sums[0] += students[i].kor;
			sums[1] += students[i].eng;
			sums[2] += students[i].math;
		}
		System.out.print("과목합계");
		for(int i = 0;i < sums.length; i++) {
			System.out.print("\t" + sums[i]);
		}
		System.out.println();
		
		//과목평균
		double[] avgs = new double[3];
		System.out.print("과목평균");
		for(int i = 0; i < avgs.length; i++) {
			avgs[i] = Math.round(((double)sums[i] / students.length) * 100) / 100.0;
			System.out.print("\t" + avgs[i]);
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
