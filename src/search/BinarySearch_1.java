package search;

/**
 * 
 * <pre>
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
		int x = 80;
		
		Binary(a, 0, a.length -1, x);
		
	}//main
	
	public static void Binary(int[] a, int left, int right, int x) {
		
		int mid = 0;
		
		while (right >= left) {
			mid = (left + right)/2;
			
			if(x == a[mid]) {
				System.out.println("x의 index : " + mid + 1);
				break;
				
			}
			
			if (x < a[mid]) {
				right = mid -1;
				
			} else { 
				left = mid +1;
				
			}
			
		}//while

		}// method 
	
}//class
