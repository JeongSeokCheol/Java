package d_arry;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 *  - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 *  - 참조형 타입이다.
		 *  - 인덱스로 값을 구분한다.
		 *  - 길이를 변경할 수 없다.
		 *  - 같은 타입만 가능하다.
		 *  - 타입뒤에[]를 많이 붙힌다.
		 */
		
		int[] array;
		array = new int[5]; //5칸을 저장할 수 있다.
		/*
		 * array(변수) = 100번지(주소)
		 * 
		 * 100번지 
		 * {0, 0, 0, 0, 0}
		 */
		
		array = new int[] {1, 2, 3, 4, 5};
		
//		array = {1, 2, 3, 4, 5}; 
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for(int i =0; i<array.length; i++) {
			array[i] = (i + 1) * 10;
			System.out.println(array[i]);
		}
		
		
		System.out.println(Arrays.toString(array));
		
		//10개의 정수를 정장할 수있는 배열을 선언및초기화 해주세요.
		int[] a = new int[10];
		
		//배열의 모든 인덱스에 1~100사의 랜덤한 값을 저장 해주세요.
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100 + 1);
		}
		//배열에 저장된 모든값의 합계와 평균을 수해주세요.
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100 + 1);
			sum += a[i];
		}
		avg = (double)sum / a.length;
		System.out.println("합계 : " + sum + " / 평균 : " + avg);
		
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해 주세요.
		int min = a[0];
		int max = a[0];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100 + 1);
			if(max < a[i]) {
				max = a[i];
			}
			if(min > a[i]) {
				min = a[i];
			}
			
		}
		System.out.println("최대 : " + max + " / 최소 : " + min);
		
//		int[] shuffle = new int[10];
//		for(int i = 0; i < shuffle.length; i++) {
//			shuffle[i] = i+1;
//		}
//		System.out.println(Arrays.toString(shuffle));
		
		//배열의 값을 섞어주세요.
		int[] shuffle = new int[10];
		int random = 0;
		
		for(int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i+1;
			
		}
		
		
		
		for(int i = 0; i < shuffle.length * 10; i++){
			random = (int)(Math.random()*shuffle.length);
			int temp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;
		}

		System.out.println(Arrays.toString(shuffle));
		
		//1~10사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.

		int[] count = new int[10];
		
		for(int i = 0; i < 500; i++) {
			int rand = (int)(Math.random() * 10 + 1);
			count[rand - 1]++;
		}
		
		System.out.println(Arrays.toString(count));
			
		
		
		
		
		
	}

}
