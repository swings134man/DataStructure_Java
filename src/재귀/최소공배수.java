package 재귀;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 최소공배수 구하기 
 * @File    : 최소공배수.java
 * @Package : 재귀
 * @author  : seokjunkang
 * @Date    : 2022. 11. 25. 오후 5:04:26
 * 
 *  - 최소공배수 구하는 방법
 *  1. 유클리드 호제법으로 최대 공약수 구하기
 *  2. 두 수 a,b 가 있을때 
 *  3. (a * b) / 최대 공약수 = 최소 공배수
 * 
 */
public class 최소공배수 {

	static int max(int a, int b) {
		if(a % b == 0) return b;
		
		return max(a, a%b);
	}
	
	
	public static void main(String[] args) {
		int a = 60;
		int b = 48;
		// 최대 공약수
		int res1 = max(a,b);
		System.out.println("최대 공약수 : "+ res1);
		
		//최소 공배수
		int min = (a*b) / res1;
		System.out.println("최소 공배수 : "+ min);
		
	}//main
}//class
