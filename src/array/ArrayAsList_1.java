package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : Arrays 클래스의 asList 메서드에 대한 클래스 
 * @File    : ArrayAsList_1.java
 * @Package : array
 * @author  : seokjunkang
 * @Date    : 2022. 8. 18. 오후 10:16:09
 */
public class ArrayAsList_1 {

	public static void main(String[] args) {
		
		/*
		 *  Arrays.asList 
		 *  
		 *   1. 해당 메서드의 반환타입은 
		 *   -> 자주 사용하는 util.ArrayList가 아닌 --->>>> Arrays 내부의 ArrayList이다.
		 *   
		 *   2. Arrays.ArrayList 는  "고정 크기의 배열을 가진 List를 return 한다."
		 *   	-> 따라서 removeAll, add, remove 등의 연산이 지원되지않는다 (Unsupported Class)
		 *    
		 *   
		 */

		List<String> list1 = Arrays.asList("a", "b", "c");
		
		System.out.println("원본 list : " + list1);
		
		// Error -> asList는 값을 추가하거나 삭제가 불가능하다.
//		list1.add("d");
//		System.out.println("추가 list : " + list1);
		
		// Error -> asList로 생성된 List는 내부적으로 배열로 취급받음
		// 하지만 set의 원소를 2 이하로 설정시 IOE 발생 하지 않음. 
//		list1.set(3, "d");
//		System.out.println("추가 list : " + list1);
		
		/*
		 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 *  1. add, remove 방지 코드 중요!!!!!!!!!!!
		 *  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 *  
		 *  asList 는 List 로 만들긴 하지만 내부적으로 배열임. -> 그래서 추가, 삭제가 불가능한것.
		 *  -> 하지만 간단하게 util.ArrayList 로 asList를 wrapping 하게 되면 
		 *  -> ArrayList 처럼 사용할 수 있다. 
		 */
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
		
		System.out.println("2 원본 List : " + list2);
		
		list2.add(4);
		list2.add(5);
		System.out.println("2 변경 List : " + list2);
		
		list2.remove(4); // index
		System.out.println("2 변경 List : " + list2);
		
	}//main

}//class
