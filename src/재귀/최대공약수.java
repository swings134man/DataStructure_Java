package 재귀;

import java.util.Scanner;

public class 최대공약수 {

	// 유클리드 호제법으로 최대공약수 구하기. 
	//정수 x,y 의 최대 공약수를 구하여 반환.
	static int gcd(int x, int y){
		if ( y == 0) {
			return x;
		}else {
			return gcd(y, x % y);
		}
	} //static 
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int y = sc.nextInt();
		
		System.out.println("최대 공약수는 " + gcd(x,y) + " 입니다.");
	} //main
} //class
