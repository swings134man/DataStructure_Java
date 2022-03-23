package sort;

import java.util.Arrays;

/**
 * 
 * <pre>
 * Quick Sort : 퀵정렬(분할정복 알고리즘)
 * 
 * 1. 하나의 리스트를 Pivot 기준으로 두개의 부분리스트로 나눔.
 * 2. 피벗을 기준으로 양쪽에서 Pivot 보다 큰값, 혹은 작은값 검색
 * 3. 왼쪽에서는 Pivot 보다 큰값 검색
 * 4. 오른쪽에서는 Pivot 보다 작은값 검색
 * 5. 양방향에서 원소 교환
 * 6. 
 * 
 *       		left part      a[(right + left)/2]      right part      
		  +---------------------------------------------------------+
		  |    element < pivot    |  pivot  |    element >= pivot   |
		  +---------------------------------------------------------+
		  
		  
 *	point : strt 와 pivot 값 비교후 
 *			pivot 보다 크면 정지. 후 swap 
 *			-- 마찬가지로 end 가 pivot 보다 작으면 정지 후 swap 
 *		  >> 해당 코드 do - while 문 
 *
 * </pre>
 * @Class   : 
 * @File    : QuickSort.java
 * @Package : sort
 * @author  : seokjunkang
 * @Date    : 2022. 3. 23. 오후 7:14:44
 */
public class QuickSort {

	/**
	 * 
	 * <pre>
	 * </pre>
	 * @Name    : 파티션을 나누기 위한 메서드 
	 * @Method  : partition
	 * @Return  : 
	 * @param left	: 현재 배열의 왼쪽부분
	 * @param right	: 현재 배열의 오른쪽 부분 
	 */
	private static void QuickSortMethod(int[] a, int left, int right) {
		
		int strt = left;						// 왼쪽 커서
		int end = right;						// 오른쪽 커서
		int pivot = a[(left + right) / 2]; // 중간
	
			
		do {
			while(a[strt] < pivot) strt++;		// 왼쪽커서가 pivot 값 보다 작으면 커서++;		==> 
			while(a[end] > pivot) end--;		// 오른쪽커서가 pivot 값 보다 크면 커서--; 오른쪽에서 줄어야함으로.
			
			if(strt <= end) {
				swap(a, strt++, end--);			
			}
		} while(strt <= end);					// 왼쪽커서와 오른쪽 커서가 같아지면 중지.
		
		
		if(left < end) {						// 왼쪽 커서(입력값0)가 오른쪽 커서(end)보다 작으면 실행. 즉 1차 정렬후 왼쪽 부분리스트 재정렬.
			QuickSortMethod(a, left, end);		// 재귀를 통한 왼쪽리스트내부 정렬.
		}
		
		if(strt < right ) {						// 왼쪽 커서가 배열-1 보다 작으면 실행.
			QuickSortMethod(a, strt, right);	// 재귀를 통한 오른쪽 리스트 정렬.
		}
		
	}//QuickSortMethod
	
	// 두 수의 교환 메서드 : swap
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		
		int[] a = {3,4,2,1,7,5,6,9,8,10}; //배열
		System.out.println("정렬전 : " + Arrays.toString(a));
		
		QuickSortMethod(a, 0, a.length -1);
		System.out.println("정렬전 : " + Arrays.toString(a));
		
		
	} //main

	
	
}//class
