package 재귀;

import java.util.Scanner;

public class FactorialEx {
	// 팩토리얼을 재귀적으로 구현.
	
	
	// 양의 정수 n의 팩토리얼을 return.
		static int factorial(int n) {
			if (n > 0) {
				return n * factorial(n - 1);
			} else {
				return 1;
			} // else 
		} // static
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int x = sc.nextInt();
		
		// 결과
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + " 입니다.");
		
	} //main
} //class
