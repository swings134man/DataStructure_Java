package algorithm.math;

public class 최대공약수_최소공배수 {

	
	// 최대 공약수 - for (Greatest Common Divisor)
	private static int gcdFor(int a, int b) {
		int answer = 0; // 최대공약수 
		int min = 0; // 두 수 중에서 값이 더 작은것.
		
		// 작은 수 구하기
		if(a <= b) { // a가 b보다 작으면!
			min = a;
		}else {		 // b가 a보다 작을 경우
			min = b;
		}
		
		// 두수를 각각 i로 나누었을 때 두수의 나머지가 0일때. -> 최대 공약수 저장.
		for (int i=1; i<=min; i++) {
			if(a%i == 0 && b%i ==0) {
				answer = i;
			}
		}
		return answer;
	}// gcdFor
	
	
	// 최대 공약수 재귀
	private static int gcdRec(int a, int b) {
		// 나머지가 0일 경우 최대 공약수는 b이다.
		if(a%b == 0) {
			return b;
		}
		
		// 재귀 호출을 통하여 해결.
		return gcdRec(b, a % b);
	}
	
	
	// 최소 공배수 - Least Common Multiple
	private static int min(int a, int b, int max) {
		return (a * b) / max;
	}
	
	
	
	public static void main(String[] args) {
		int a = 48;
		int b = 36;
		
		System.out.println("두 숫자 a: " +a+ " b: " +b);
		// 반복문 - 최대 공약수
		System.out.println("최대 공약수(반복문): "+gcdFor(a, b));
		// 재귀 - 최대 공약수
		System.out.println("최대 공약수(재귀): "+gcdRec(a, b));
		
		// 최소 공배수
		int max = gcdRec(a,b);
		int min = min(a,b,max);
		System.out.println("최소 공배수: " +min);
	}//main
} //class
