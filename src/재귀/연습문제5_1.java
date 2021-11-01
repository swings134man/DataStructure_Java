package 재귀;

import java.util.Scanner;

public class 연습문제5_1 {

	static int factorial(int n) {
		//곱셉을 위해 1로 초기화
		int a = 1;
		//n: 정수 조건
		if (n > 0) {
			//n부터 1씩 감소하면서 곱한다.
			for (int i = n; i > 0 ; i--) {
				a = a * i;
				// ex.) 5 * 4 * 3 * 2 * 1
			}
			return a; // n!  
		}else {
			return 1; // n이  0과 같거나 작을때. 
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. >> ");
		int x = sc.nextInt();
		
		System.out.println(x +  " 의 팩토리얼은 " + factorial(x) + " 입니다.");
		
		
		
	} //main
}// class
