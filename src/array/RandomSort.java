package array;

import java.util.Arrays;
import java.util.Iterator;
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
		
		// --------------------------------------------------
		// 선택 정렬 (Insert Sort)
		int prim = 0; //기준값 => 비교대상 
		int j = 0;
		
		for (int i = 1; i < list.length; i++) {
			prim = list[i];
			
			for (j = i -1; j >= 0 && list[j] > prim; j--) {
				list[j + 1] = list[j];
				
			}
			list[j+1] = prim;
			
		} //for
		
		System.out.println("정렬 후 : " + Arrays.toString(list)); // 난수 발생확인
		
	}//main
}//class
