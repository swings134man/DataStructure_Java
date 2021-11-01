package array;

import java.util.Scanner;

public class ArrayReverse {

	
	static void swap(int[] a, int a1, int a2) {
		int t = a[a1]; 
		 a[a2] = a[a1];
		 a[a1] = t;
	}//swap
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length -i -1);
		}
	}//reverse
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("입력");
			num[i] = sc.nextInt();
		}// for
		
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ", ");
		}// for
			
		System.out.println();
		
			
		// 리버스
		for (int i = 0; i < num.length / 2; i++) {
			int t = num[i];
			num[i] = num[num.length -i -1];
			num[num.length -i -1] = t;
		}// for
			
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ", ");
		}//for
		
		
		
		
	}//main
} //class
