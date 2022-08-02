package set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : java HashSet Class  
 * @File    : HashSet_1.java
 * @Package : set
 * @author  : seokjunkang
 * @Date    : 2022. 8. 1. 오후 6:51:19
 */
public class HashSet_1 {

	public static void main(String[] args) {
		/*
		 * 1. HashSet은 중복이 불가
		 * 2. 순서가 없음.
		 * 
		 */
		
		
		HashSet<String> set1 = new HashSet<String>();	//String
		HashSet<Integer> set2 = new HashSet<Integer>();	//Integer
		
		// set 값 추가
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("a"); // 중복 불가
		
		// set2
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(1); // 중복 불가
		set2.add(4); // 삭제용
		set2.add(5); 
		
		// set 값 삭제
		set2.remove(4); // value 만 삭제. 
//		set1.clear(); // set의 모든값 삭제
		
		// set 크기 구하기
		set1.size();
		set2.size(); // 중복값이 있을시 자동 제거 후 결과 출력
		
		// 출력
		System.out.println(set1); // (a,b,c)
		System.out.println(set2); // (1,2,3)
		
		// 하나의 데이터 출력 원할시 
		// String
		Iterator iter1 = set1.iterator();
		while(iter1.hasNext()) {
			System.out.print(iter1.next() + " ");
		}
		System.out.println();
		
		// HashSet 검색
		System.out.println("set1 에 데이터 존재 여부 : " + set1.contains("a")); // true/false
		System.out.println("set1 에 데이터 존재 여부 : " + set1.contains("d"));
		
		
		
		// 추가 : 값 꺼내서 넣기
		// set2의 값이 3이상인것을 배열에 넣기
		int[] overNum = new int[set2.size()];
//		for(int result : set2) {
//			if(result >= 3) {
//				
//			}
//		}
		
		
		
	} // main
} // class
