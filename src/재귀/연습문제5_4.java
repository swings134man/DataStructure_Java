package 재귀;

import java.util.Scanner;

public class 연습문제5_4 {

	
	static void recur2(int n) {
		if (n > 0) {
			recur2(n -2);
			System.out.println(n);
			recur2(n - 1);
		}
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >>>> ");
		int x = sc.nextInt();
		
		recur2(x);
	} //main
}// class
