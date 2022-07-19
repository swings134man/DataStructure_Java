package test;

import java.util.Arrays;


/**
 * 
 * <pre>
 * </pre>
 * @Class   : 코드 연습장. (내용은 수시로 변경가능성이 있음.) 
 * @File    : TestCode.java
 * @Package : test
 * @author  : seokjunkang
 * @Date    : 2022. 7. 5. 오후 7:05:49
 */
public class TestCode {
	
	public static void main(String[] args) {

		int[] list = {3,5,4,1,2};
		
		System.out.println(Arrays.toString(list));
		
		sort(list);
		
		System.out.println(Arrays.toString(list));
	} //main
	
	public static void sort(int[] list) {
		
		for (int i = 1; i < list.length; i++) {
			
			int base = list[i]; //기본값
			
			int target = i -1 ; //비교대상.
			
				while (target >= 0 && list[target] > base) {
					list[target + 1] = list[target];
					target--;
				}
				list[target +1] = base;
			
		}
		
		
	}
	
	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	} // swap 
	
	
}//class
