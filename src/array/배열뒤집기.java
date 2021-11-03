package array;

import java.util.Arrays;

public class 배열뒤집기 {

	public static void main(String[] args) {

		//배열 뒤집기.
		int[] a = {1,2,3,4,5};		//기준 배열
		
		int[] b = new int[a.length];		//reverse 값을 넣어줄 배열.
		
		for(int i = a.length -1, j = 0; i >= 0; i--, j++) {	//int i,j 를 동시 선언 및 조건 부여.
				b[j] = a[i];	
		}//for
		System.out.println(Arrays.toString(b));
		
		
	} //main
}//class
