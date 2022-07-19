package array;

import java.util.Random;

public class 동적배열 {

	public static void main(String[] args) {

		int[] arr = null;
		
		Random r = new Random();
		
		int number = r.nextInt(10) +1;
		
		arr = new int[number];
		
		
		System.out.println(number);
		
	}

}
