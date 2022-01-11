package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		//예외 발생시키기
		try {
			throw new IOException();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
//		throw new NullPointerException(); //null값이 들어가면 안되는 곳에  null이 들어간 경우
		
//		String str = null;
//		
//		str.equals("");
		
		
//		throw new IndexOutOfBoundsException(); //인덱스의 범위를 벗어날 경우
		
//		int[] arr = new int[5];
//		
//		System.out.println(arr[5]);
		
		
	}

}
