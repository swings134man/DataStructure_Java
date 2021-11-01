package 재귀;

import java.util.Scanner;

public class 꼬리재귀 {

	static void recur(int n) {
		while (n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}//while
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
		int x = sc.nextInt();
		
		recur(x);
		
		
	} //main
}//class
