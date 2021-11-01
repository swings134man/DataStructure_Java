package search;

import java.util.Scanner;

public class LinearSearch01 {
	
	static int search(int[] list, int num ,int result) {
		for (int i = 0; i < num; i++) {
			if (list[i] == result) {
				return i;
			}
			
		}//for
		return -1;
		
	}// method
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인덱스 개수 입력 >>> ");
		int num = sc.nextInt();
		int[] list = new int[num];
		
		System.out.println("인덱스 값 입력 >>> ");
		for (int i = 0; i < list.length; i++) {
			System.out.print("list[" + i + "] = ");
			list[i] = sc.nextInt();
		}
	
		
		System.out.print("검색값 입력.. >>>");
		int result = sc.nextInt();
		
		int x = search(list, num, result);
		
		if (x == -1) {
			System.out.println("검색결과가 없습니다.");
		}else {
			System.out.println("검색값 " + result + "는 " + "list[" + x + "] 에 있습니다.");
		}
		
		
		
		
		
		
		
	}//main
}//class
