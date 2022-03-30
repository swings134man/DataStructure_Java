package search;

/**
 * 
 * <pre>
 * 순차 정렬이 되어있다는것이 전제.
 * 중앙값을 찾고 찾을려는 값과 비교해서 조건을 줄여나감.
 * </pre>
 * @Class   : 이진탐색 알고리즘 
 * @File    : BinarySearch_1.java
 * @Package : search
 * @author  : seokjunkang
 * @Date    : 2022. 3. 30. 오후 6:26:34
 */
public class BinarySearch_1 {

	public static void main(String[] args) {
		int[] a = {10, 20,30,40,50,60,70,80,90};
		int x = 80; // 탐색할 값.
		
		Binary(a, 0, a.length -1, x);
		
	}//main
	
	public static void Binary(int[] a, int left, int right, int x) {
		
		int mid = 0;
		
		while (right >= left) {
			mid = (left + right)/2;	// 연산 결과에 따라 pivot 값이 변경되어야 하기에 while문안에 위치, 나머지 버림
			
			if(x == a[mid]) {	// 검색하고자 하는 값이 pivot값이랑 같으면 출력 후 break;
				System.out.println("x의 index : " + mid + 1);
				break;
				
			}
			
			if (x < a[mid]) {		// pivot값 보다 검색값이 작으면 
				right = mid -1;		// 검색할 값은 pivot -1 보다 작아야 0~ pivot-1 이 되서 조건을 줄일 수 있음. 
				
			} else { 				// pivot값 보다 검색값이 크면 
				left = mid +1;		// left의 값은 = pivot 값 +1 -> 0~5 pivot(6) 7 ~9 라면 -> left = 7 => 7~
				
			}
			
		}//while

		}// method 
	
}//class
