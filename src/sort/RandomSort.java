package sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * <pre>
 * 랜덤으로 생성된 숫자의 배열을 정렬.
 * </pre>
 * @Class   : 
 * @File    : RandomSort.java
 * @Package : array
 * @author  : seokjunkang
 * @Date    : 2022. 3. 20. 오후 8:29:17
 */
public class RandomSort {

	public static void main(String[] args) {

		Random random = new Random(); //랜덤 객체
		int[] list = new int[10]; //랜덤 숫자를 받을 int 배열
		
		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt(100);
		}//for
		
		System.out.println("정렬 전 : " + Arrays.toString(list)); // 난수 발생확인
		
		// -------------------- 정렬 ------------------------------
		
		sort(list);	 // method 호출.
		System.out.println("정렬 후 : " + Arrays.toString(list)); // 정렬 확인
		
	}//main
	
	// 선택 정렬 (Insert Sort)
	static void sort(int[] list) {
				//기준값 = 앞, 비교값 = 기준값 + 1
		
				int prim = 0; //기준값 => 비교대상 
				int j = 0;
				
				for (int i = 1; i < list.length; i++) {
					prim = list[i]; // 임시저장할대상 = 기준값 + 1  
					
					for (j = i -1; j >= 0 && list[j] > prim; j--) { //비교 : j = index 0, i = 1
						list[j + 1] = list[j]; // 비교값 = 기준값, 비교대상이 큰경우 오른쪽으로 밀어버림.
						
					}
					list[j+1] = prim; // 기준값 저장.
					
				} //for
	}//sort
	
}//class
