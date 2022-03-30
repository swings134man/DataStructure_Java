package sort;

import java.util.Arrays;

/**
 * 
 * <pre>
 * 선택정렬, 버블정렬 보다 빠름 >> 그럼에도 시간복잡도는 O(n^2)
 * </pre>
 * @Class   : InsertionSort(삽입정렬)
 * @File    : InsertionSort.java
 * @Package : sort
 * @author  : seokjunkang
 * @Date    : 2022. 3. 31. 오전 1:02:34
 */
public class InsertionSort {

	public static void sort(int[] list) {
		
		for (int i = 1; i < list.length; i++) {
			
			int key = list[i]; // 기본 비교값의 다음 원소
			int j = i - 1;	   // 기본 비교값.
			
				while (j >= 0 && list[j] > key) { // j 가 0과 같거나 크고, 비교값(왼쪽) 의 값이 key(오른쪽) 값보다 크면
					list[j + 1] = list[j];	// 오른쪽의값 = 왼쪽값(비교값) ==> 30(이전 20) = 30(0번 인덱스)
					j --;	// 키값을 왼쪽값으로 set 해주기 위함.
				}
			list[j + 1] = key;	// 왼쪽값(기본값) = 정렬전 비교값(key)
			
		}//for
				
	}
	
	public static void main(String[] args) {

		int[] list = {30,20,10,70,60,40,50,80,90};
		System.out.println("정렬 전 : " + Arrays.toString(list));
		
		sort(list);
		
		System.out.println("정렬 후 : " + Arrays.toString(list));
		
		
	} //main
}//class
