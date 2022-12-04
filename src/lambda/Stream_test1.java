package lambda;

import java.util.ArrayList;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : Java-Stream Test 1 
 * @File    : Stream_test1.java
 * @Package : lambda
 * @author  : seokjunkang
 * @Date    : 2022. 12. 4. 오후 5:34:48
 */
public class Stream_test1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		list.stream().filter("b"::equals)
		.forEach(System.out::println); //list에서 값이 b 인것만 출력
		
		
		
	}//main

}//class
