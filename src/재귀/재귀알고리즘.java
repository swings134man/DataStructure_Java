package 재귀;

import java.util.Scanner;

public class 재귀알고리즘 {

	//재귀 함수.
	static void recur(int n) {
		if (n > 0) {
			// n-1 을 input으로 하는 recur 호출
			recur(n - 1);
			System.out.println(n);
			// n-2 을 input으로 하는 recur 호출
			recur(n - 2);
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 <>>>");
		int x = sc.nextInt();
		
		recur(x);
		
		
	} //main
}//class
