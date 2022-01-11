package j_collection;

import java.util.ArrayList;


public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * collection Framework
		 * - List    인덱스에 저장, 값을 읽어오는 속도가 빠르다. , 쓰는 속도는 느리다.
		 * - Map     인덱스가 아니라 키를 저장, 순서라는 개념이 없다
		 * - Set     중복되는 값을 저장할 수 없다
		 * 
		 * ArrayList의 주요 메서드
		 * - boolean add(Object obj) : 마지막 위치에 겍체를 추가 후 성공여부를 반환한다.
		 * - void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * - Object set(int index, Object obj) : 지정된 위치에 객체를 저장후 기존 객체를 반환하다.
		 * - Object get (int index): 지정된 위치의 객체를 반환한다.
		 * - int size() : 저장된 객체의 수를 반환한다.
		 * - Object remove(int index) : 지정된 위치의 객체를 제거한다. 뒤에있는 모든 값이 한칸씩 전진
		 */
		
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100); //아무타입이나 가능
		
		System.out.println(sample);
		
		ArrayList<Integer> list = new ArrayList<>(); //<>제네릭: collection에 타입을 지정해 준다.
		                                             //collection에는 객체만 저장
		/*
		 * WrapperClass
		 * 
		 * byte    : Byte
		 * short   : Short
		 * int     : Integer
		 * long    : Long
		 * float   : Float
		 * double  : Double
		 * boolean : Boolean
		 * char    : Character
		 */
		
		list.add(10); //자동으로 Integer로 형변환이 됨
//		list.add("abc");
		list.add(new Integer(20)); // Integer라는 객체를 생성하고 값을 저장
		System.out.println(list.add(30));
		System.out.println(list);
		
		list.add(1,40);
		System.out.println(list);
		
//		list.add(5,50);
		
		//수정
		Integer before = list.set(2,50);
		System.out.println("before : " + before);
		System.out.println(list);
		
		//읽기
		int get = list.get(2);
		System.out.println(get);
		
//		for(int i = 0; i< list.size(); i++) {
//			System.out.println(i + " : " + list.remove(i));
//		}
//		System.out.println(list);
		
		for(int i = list.size()-1; i >=0; i --) {
			System.out.println(i + " : " + list.remove(i));
		}
		System.out.println(list);
		
		//list에 1~100사이의 랜덤값을 10개 저장해 주세요.
		
		for(int i = 0; i < 10;  i++) {
			list.add((int)(Math.random()*100)+1) ;
		}
		System.out.println(list);
		
		//list에 저장된 값의 함계와 평균을 구해주세요
		int sum = 0;
		for(int i = 0; i < list.size() ; i++) {
			sum += list.get(i);
		}
		double avg = (double)sum/list.size();
		System.out.println("합계 : " + sum );
		System.out.println("평균 : " + avg);

		//list에서 최소값과 최대값을 구해주세요.
		int min = list.get(0);
		int max = list.get(0);
	
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < min) {
				 min = list.get(i);
			}
			if(list.get(i) > max) {
				 max = list.get(i);
			}
					
		}

		System.out.println("최소 : " + min);
		System.out.println("최소 : " + max);
		
		//list를 오름차순으로 정렬해 주세요
//		int temp = 0;
//		int mi = 0;
		for(int i = 0 ; i < list.size()-1 ; i++) {
			min = i;
			for (int j = i+1 ; j < list.size(); j++) {
				if(list.get(j) < list.get(min)) {
					min = j;
				}
			}
//			int temp = list.get(i);
//			list.set(i,list.get(min));
//			list.set(min, temp);
			
			list.set(min, list.set(i,list.get(min)));
			
		}
		System.out.println(list);
	
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		
		list = new ArrayList<>();
		list.add(40);
		list.add(50);
		
		list2.add(list);
		
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++) {
			ArrayList<Integer> temp = list2.get(i);
			for(int j =0 ; j < temp.size(); j++) {
				System.out.println(temp.get(j));
			}
		}
		list2.get(0).get(1);
		System.out.println(list2.get(0).get(1));
	
		//학생 3명의 5과목에 대한 점수를 0~100사이의 점수로 발생시켜서 2차원 ArrayList에 저장해 주세요
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
		
		for(int j = 0; j < 3; j++){
			ArrayList<Integer> score = new ArrayList<>();
			for(int i = 0; i < 5; i++) {
				score.add((int)(Math.random()*101));
				
			}
			scores.add(score);
		}
		
		
		
		
		//각 학생의 합계와 평균을 구해주세요
		
		ArrayList<Integer> sums = new ArrayList<>();
		ArrayList<Double> avgs = new ArrayList<>();
		
		for(int i = 0; i < scores.size(); i ++) {
			sum = 0;
			ArrayList<Integer> score = scores.get(i);
			for(int j = 0; j < score.size() ; j++) {
				sum += score.get(j);
				
			}
			sums.add(sum);
			avgs.add((double)sum/ scores.size());
		}
		System.out.println(sums);
		System.out.println(avgs);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
