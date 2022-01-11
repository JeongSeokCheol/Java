package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		int money = (int)(Math.random()*500)*10;
		int[] coin = { 500, 100, 50, 10};
		
		System.out.println("거스름돈 : " + money);
		
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해 주세요.
		 * 
		 * 거스름돈:2860원
		 * 500원: 5개
		 * 100원 : 3개
		 * 50원: 1개
		 * 10원: 1개
		 */
		
		int[] rest = new int[coin.length]; //일반 변수를 줘도됨
		
		for(int i = 0; i < coin.length; i++) {
					
					rest[i] = money / coin[i];
					money = money % coin[i];
					System.out.println(coin[i] + "원 : " + rest[i] + "개");
				}	
		
		
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5 ) + 1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5의 숫자가 발생된 횟수만큼 *을 사용해 그래프를 그려주세요
		 * 
		 * 1: *** 3
		 * 2: **** 4
		 * 3: ** 2
		 * 4: ***** 5
		 * 5: ****** 6
		 */
		
		int[] count = new int[5];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - 1]++;
		}

		for (int i = 0; i < count.length; i++) {
			System.out.print(i + 1 + ": ");
			for (int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			System.out.println(" " + count[i]);

		}
		
		
		
		arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5의 랜덤한 값이 1개 저장된 배열에서 중복된 값이 제거된배열을 만들어주세요.
		 * [2,2,2,4,1,1,4,2,1,2]
		 * [2,4,1]
		 */
		
		int[] temp =  new int[5];
		 int count1 = 0;

		for(int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for(int j = 0; j < temp.length; j++) {
				if(arr[i] == temp[j]) {
					flag = false;
					}		
				}
			if(flag) {
				temp[count1++] = arr[i];
			}
		}
		
		int[] result = new int[count1];

		for (int i = 0; i < result.length; i++) {
			result[i] = temp[i];
		}
		
		
		System.out.println(Arrays.toString(result));


	
		
	}
}
			
		
