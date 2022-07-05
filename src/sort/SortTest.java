package sort;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {

		int[] list = {3,5,2,1,4};
		
		System.out.println(Arrays.toString(list));
		
		sort(list);
		
		System.out.println(Arrays.toString(list));
		
	} //main


	
	public static void sort(int[] list) {
		
		for (int i = 1; i < list.length; i++) {
			
			int base = list[i]; // 기준값
			
			int target = i -1; // 비교대상.
			
			while(target >= 0 && list[target] > base) { //-> base값이 target 보다 크면 자리바꿈 필요.
				list[target + 1] = list[target];	// 비교대상이 크면 오른쪽으로 밀어냄.
				target --;
			}
			list[target +1] = base;
			
		}
		
		
	}
	
	
}//class
