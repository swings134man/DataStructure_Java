package array;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {

	// iterator : 이터레이터
		
		
	ArrayList list1 = new ArrayList();
	
	list1.add(0, "1");
	list1.add(1, "2");
	list1.add(2, "3");
	list1.add(3, "4");
		
	System.out.println(list1);	
	
	ListIterator list2 = list1.listIterator();

	for (int i = 0; i < list1.size(); i++) {
		System.out.println(list2.next());
	} // for 
	
	System.out.println(list1.iterator().toString()); // 주소만 나옴 현
	
	} //main
} // class
