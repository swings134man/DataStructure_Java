package sort;

import java.util.Arrays;

/**
 * 
 * <pre>
 * 시간 복잡도 O(n^2) <-> 버블정렬과 같음
 * 1사이클당 모든 요소를 탐색함
 * 
 * 1. 주어진 리스트에서 최솟값을 찾는다.
 * 2. 최솟값을 맨 앞 자리의 값과 교환한다.
 * 3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다. 
 * </pre>
 * @Class   : 선택 정렬 Selection Sort
 * @File    : SelectionSort.java
 * @Package : sort
 * @author  : seokjunkang
 * @Date    : 2022. 3. 31. 오전 1:33:26
 */
public class SelectionSort {

	private static void sort (int[] list) {
		
		for (int i = 0; i < list.length - 1; i++) {
			
			int min_index = i;	// 한칸씩 선택. 오른쪽으로 이동하면서.
			
			// list 내부의 최소값  index 찾기
			for (int j = i + 1; j < list.length; j++) {	// 정렬된 값 다음값부터 검색.
				if (list[j] < list[min_index]) {		// 정렬 종료된 다음값이 리스트 내부의 최소값 보다 작으면 --> 계속해서 min_index에 최소값을 set
					min_index = j;	// 최소값 = 기준값		// --> min_index가 최소일때는 아무 동작 하지않음.
				}
			}
			
			swap(list, i, min_index);
		}//for
		
	}//sort
	
	private static void swap (int[] list, int basic, int min) {
		
		int temp = list[basic];
		list[basic] = list[min];
		list[min] = temp;
	}//swap
	
	public static void main(String[] args) {

		int[] list = {30,20,10,70,60,40,50,80,90}; // 기준 list
		System.out.println("List 정렬 전 : " + Arrays.toString(list));
		
		sort(list);
		System.out.println("List 정렬 후 : " + Arrays.toString(list));
	}// main
}//class
