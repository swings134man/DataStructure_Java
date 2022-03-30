package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterator01 {

	public static void main(String[] args) {

	// iterator : 이터레이터
		
		
	LinkedList list1 = new LinkedList();
	
	list1.add(0);
	list1.add(1);
	list1.add(2);
	list1.add(3);
		
	System.out.println("Example List : " + list1);	
	
//	ListIterator list2 = list1.listIterator();
//
//	for (int i = 0; i < list1.size(); i++) {
//		System.out.println(list2.next());
//	} // for 
//	
	
	List ListResult = new ArrayList(); // iterator 를 통하여 결과를 넣을 LIST
	
	Iterator itr = list1.iterator(); // Iterator = list  
	while (itr.hasNext()) {
		ListResult.add(itr.next());	// cursor의 방향 true 일떄까지 이동하면서 값 get
	}
	
	System.out.println("After" + ListResult);
	
	} //main
} // class
