package array;

public class ArrayChange {

	public static void main(String[] args) {

		//swap 
		
		int x = 30;
		int y = 60;
		int t = 0;
		
		System.out.println("x :" + x);
		System.out.println("y :" + y);
		
		 t = x;
		 x = y; 
		 y = t;
		 
		System.out.println("x :" + x);
		System.out.println("y :" + y);
		
		
		int[] a = {12, 23, 36, 44, 57, 69, 77};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		
		
	}

}
