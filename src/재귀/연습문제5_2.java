package 재귀;

import java.util.Scanner;

public class 연습문제5_2 {

	
	static int gcd(int x, int y) {
		while (y != 0) {
			int a = x % y;
			x = y; // x의 자리에 y가 들어감.
			y = a; // a가 y 자리에 들어감. 
		}// while
		return x;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 입력 >> ");
		int x = sc.nextInt();
		System.out.print("정수 입력 >> ");
		int y = sc.nextInt();
		
		System.out.println("최대 공약수는 " + gcd(x,y) + " 입니다.");
		
	}//main
}//class
