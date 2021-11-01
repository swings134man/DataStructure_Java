package array;

import java.util.Random;
import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		
		
		System.out.print("값을 입력하세요.. >>");
		int num = scanner.nextInt();
		int[] a = new int[num];
		
		
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
			if (max < a[i]) {
				System.out.println(max);
				max = a[i];
			}
		}
		System.out.println("최대값은 : " + max);
		
		
		
	}
}
