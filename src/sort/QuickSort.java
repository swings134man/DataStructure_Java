package sort;

import java.util.Arrays;

/**
 * 
 * <pre>
 * Quick Sort : 퀵정렬
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
		
		int lo = left;						// 왼쪽 커서
		int hi = right;						// 오른쪽 커서
		int pivot = a[(left + right) / 2]; // 중간
	
			
		do {
			while(a[lo] < pivot) lo++;
			while(a[hi] > pivot) hi--;
			if(lo <= hi) {
				swap(a, lo++, hi--);
			}
		} while(lo <= hi);
			
		if(left < hi) {
			QuickSortMethod(a, left, hi);	// 재귀
		}
		if(lo < right ) {
			QuickSortMethod(a, lo, right);	// 재귀
		}
		
	}
	
	// 두 수의 교환 메서드
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		
		int[] a = {3,4,2,1,7,5,6,9,8,10}; //배열
		System.out.println("정렬전 : " + Arrays.toString(a));
		
		QuickSortMethod(a, 0, a.length -1);
		System.out.println("정렬전 : " + Arrays.toString(a));
		
		
	} //main

	
	
}//class
