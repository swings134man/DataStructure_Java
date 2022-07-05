package list;

import java.util.LinkedList;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : Linked List 연습1 
 * @File    : LinkedList1.java
 * @Package : list
 * @author  : seokjunkang
 * @Date    : 2022. 6. 9. 오후 6:35:45
 */
public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList li1 = new LinkedList();
		
		
		for (int i = 0; i < 5; i++) {
			li1.add("list" + i);
		}
		
		System.out.println(li1); // linked list 출력
		
		li1.add(1, "add obj"); // linked list add 
		
		System.out.println(li1);
		
		// 링크드 리스트 검색
		System.out.println(li1.contains("list4")); // true || false
		
		System.out.println(li1.indexOf("list3"));
		
	}//main

}//class
