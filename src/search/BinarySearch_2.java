package search;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 이진탐색 알고리즘 (재귀)
 * @File    : BinarySearch_2.java
 * @Package : search
 * @author  : seokjunkang
 * @Date    : 2022. 3. 30. 오후 7:41:08
 */
public class BinarySearch_2 {

	public static void main(String[] args) {
		
		int[] a = {10, 20,30,40,50,60,70,80,90};
		int x = 70; // 탐색할 값.

		int result = binarySearch(a, 0, a.length -1, x);
		
		if(result != -1) {
			System.out.println("x의 인덱스 : " + result);
			
		}else if(result == -1) {
			System.out.println("해당 결과값을 찾지 못했습니다.");
		}
		
	}//main

	public static int binarySearch(int[] a, int left, int right, int x) {
		
		if(left > right) { // 해당 값을 찾지 못함.
			return -1;
		}
		
		int mid = (left + right) / 2; // 가운데 pivot값
		
		
		// 해당 값을 찾았을때 해당 인덱스 return
		if(x == a[mid]) {
			return mid;
		}
		
		if(x > a[mid]) {	// 찾는 값이 중앙(pivot)값 보다 크면. 왼쪽 부분 배열 배제. --> 오른쪽 부분배열 필요
			return binarySearch(a, mid +1, right, x);
		}
		
		return binarySearch(a, left, mid -1, x);
	} //method
	
}//class
