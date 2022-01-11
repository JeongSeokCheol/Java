package Enjoy;

import java.util.Arrays;

public class Test5 {
	public static void main(String[] args) {
		
		int [] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5의 랜덤한 값이 1개 저장된 배열에서 중복된 값이 제거된배열을 만들어주세요.
		 * [2,2,2,4,1,1,4,2,1,2]
		 * [2,4,1]
		 */
		
		
		int count2 = 0;
		
//		for(int i = 0; i < arr.length; i++) {
//				count1[arr[i]-1]++;
//				
//			}
//		for(int i = 0; i < count1.length; i++) {
//			if(count1[i]>0) {
//				count2++;
//			}
//		}
		
		

		
		for(int i = 1; i < arr.length; i++) {
			
				if(arr[i] == arr[i-1]) {
					arr[i-1] = 0;
					}
				if(arr[i] == 0) {
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
					}
				
				if(arr[i-1] != 0 ) {
					count2++;
			}
		}
		
		int[] count1 = new int[count2];
		
		for(int i = 0; i<count2;i++) {
			count1[i] = arr[i];
		}
		
		
		
		System.out.println(Arrays.toString(count1));
		

	}
}
