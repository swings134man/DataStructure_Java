package search;

import java.util.Scanner;

public class LinearSearch02 {

	static int search(int[] array, int x, int y) {
		
		int i = 0;

		array[x] = y; // 보초 추가
		
		while (true) {
			if (array[i] == y) {
				break;
			}
			i++;
		}
		return i == x? -1:i; 
	}
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 길이 입력 >>> ");
		int x = sc.nextInt();
		int[] array = new int[x + 1];
		
		
		System.out.println("index 값 입력");
		for (int i = 0; i < x; i++) {
			System.out.print("list[" + i + "] = ");
			int num = sc.nextInt();
			array[i] = num;
		}
		
		
		System.out.print("검색 값 입력 >> ");
		int y = sc.nextInt();
		
		
		
		
		int result = search(array, x, y);
		if (result == -1) {
			System.out.println("검색결과가 없습니다.");
		}else {
			System.out.println("검색값 " + y + "는 " + "list[" + result + "] 에 있습니다.");
		}
		
		
		
	}//main
}//class
