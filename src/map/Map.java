package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : Map Study & Test Class 
 * @File    : Map.java
 * @Package : map
 * @author  : seokjunkang
 * @Date    : 2022. 3. 24. 오후 6:38:03
 */
public class Map {

	public static void main(String[] args) {
		
		// Hash Map : put 된 데이터들에 순서 존재 x , key/value 로 접근
		HashMap<String, String> map1 = new HashMap<String, String>(); //map1
		map1.put("id", "swings134");
		map1.put("pw", "1234");
		map1.put("addr", "paju");
		
		System.out.println(map1);
		System.out.println(map1.size()); // map 의 사이즈 
		System.out.println(map1.get("id"));			// 해당 Key의 Value 출력
		System.out.println(map1.containsKey("i"));  // Key 값중에 존재여부 검색 true/false 출력
		
		map1.remove("addr"); 	// 해당 key / value 삭제
		
		System.out.println(map1);
		
		// default
		System.out.println(map1.get("java"));	// map 내부에 Key 값이 없을때 null 출력	
		System.out.println(map1.getOrDefault("java", "fun"));	// getOrDefault 없을땐 fun 값 출력 하게함.
		
		// keySet
		System.out.println(map1.keySet()); // map에 put 된 key 값들을 관리
		
		List<String> keyList = new ArrayList<>(map1.keySet());	 // List 형태로 관리 가능
		
		System.out.println(keyList); 
		System.out.println("------------------ HashMap ---------------------");

		//LinkedHashMap :put 순서대로 정렬.
		LinkedHashMap<String, String> LinkMap = new LinkedHashMap<String, String>();
		
		LinkMap.put("name", "Kang");
		LinkMap.put("phone", "1234");
		LinkMap.put("gender", "M");
		LinkMap.put("height", "178");
		
		System.out.println(LinkMap);
		
		LinkMap.remove("gender");
		
		System.out.println(LinkMap.keySet());
		System.out.println(LinkMap.get("name"));
		System.out.println(LinkMap);
		System.out.println("------------------ LinkedHashMap ---------------------");
		
		// TreeMap : 입력된 key의 오름차순 순서로 데이터를 저장.
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		
		treeMap.put("apple", "1");
		treeMap.put("melon", "2");
		treeMap.put("banana", "3");
		treeMap.put("grape", "4");
		
		System.out.println(treeMap);
		System.out.println(treeMap.keySet());
		
	} // main
}//class
