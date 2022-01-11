package e_oop.score;

public class Score {

	public static void main(String[] args) {
		String[] studentNames = {"민진홍","노현정","박상진","이정수"};
		
		Student[] students = new Student[studentNames.length];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			
			students[i].name = studentNames[i];
			students[i].kor = (int)(Math.random()*101);
			students[i].eng = (int)(Math.random()*101);
			students[i].math = (int)(Math.random()*101);
			students[i].rank = 1;
			students[i].sum = students[i].kor + students[i].eng + students[i].math;
			students[i].avg = Math.round((students[i].sum / 3.0) * 100) / 100.0;
			
			
		}
		for(int i =0; i < students.length; i++) {
			
			for(int j = 0; j <students.length; j++) {
				if(students[i].sum < students[j].sum) {
					students[i].rank ++;
				}
			}
		}
		
		for(int i = 0; i < students.length; i++) {
				for(int j = i+1 ; j < students.length; j++) {
					if(students[i].sum < students[j].sum) {
						Student tmp  = students[i];
						students[i] = students[j];
						students[j] = tmp;
					}
				}
			}
		
			for(int i = 0; i < students.length; i++) {
				students[0].subSum += students[i].kor;
				students[1].subSum += students[i].eng;
				students[2].subSum += students[i].math;
				
			}
		
			for(int i = 0 ; i < 3;i++) {
				students[i].subAvg = Math.round((students[i].subSum / (double)students.length)*100)/100.0;
			}
		
		
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");

		for(int i = 0; i < students.length; i++) {
			System.out.print(students[i].name + "\t");			
			System.out.println(students[i].kor + "\t" + students[i].eng + "\t" + students[i].math+"\t" 
								+students[i].sum + "\t" + students[i].avg + "\t" + students[i].rank);		
		}
		System.out.print("과목합계");
		for(int i = 0; i < 3; i++) {
			System.out.print("\t" + students[i].subSum);
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0; i < 3; i++) {
			System.out.print("\t" + students[i].subAvg);
		}
		
		
		
		
		
		
		
	}

}
