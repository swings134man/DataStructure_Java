package 문자열검색;

public class 문자열뒤집기 {

	public static void main(String[] args) {

		// String 문자열 뒤집기
		String a = "abcde";
		// for 문으로 뒤집기
		String result = ""; //결과 담을 String 변수.
		for(int i = a.length() - 1; i >= 0; i--) {
			result = result + a.charAt(i);
		}//for
		System.out.println(result);

		// String buffer
		String result2 = "abcde"; 				     // 문자열2
		StringBuffer sb = new StringBuffer(result2); // StringBuffer의 파라메터로 문자열.
		result2 = sb.reverse().toString();			 // 기준 문자열 = 객체+뒤집기+toString;
		System.out.println(result2);
		
		
		
	} //main
}//class
