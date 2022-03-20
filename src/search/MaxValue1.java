package search;

/**
 * 
 * <pre>
 * 알고리즘 : 최대값 찾기 1번
 * </pre>
 * @Class   : 
 * @File    : MaxValue1.java
 * @Package : search
 * @author  : seokjunkang
 * @Date    : 2022. 3. 20. 오후 8:01:45
 */
public class MaxValue1 {

	public static void main(String[] args) {

		int[] input = {1, 17 ,10, 7, 13}; // 원소 = 5 \
		int max = 0;	//최대값을 담아줄 변수
		
		for(int i = 0; i < input.length; i++) {
			
			if(input[i] > max) {
				max = input[i];
			}//if
			
		}//for
		
		System.out.println("max = " + max);
		
		
	} //main
}//class
