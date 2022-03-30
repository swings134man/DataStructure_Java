package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : map 내부에 List 넣기 
 * @File    : Map_List.java
 * @Package : map
 * @author  : seokjunkang
 * @Date    : 2022. 3. 30. 오후 11:40:22
 */
public class Map_List {

	public static void main(String[] args) {

		Map<String, Object> map1 = new HashMap<String, Object>(); // map1
		List<Object> list1 = new ArrayList<Object>();			 // List
		
		// map에 데이터 put, map을 list에 add
		map1.put("key1", "value1");
		map1.put("key2", "value2");
		list1.add(map1);
		
		System.out.println("list1 : " + list1);
		
		Map<String, Object> map2 = new HashMap<String, Object>(); // map1
		map2 = (HashMap<String, Object>) list1.get(0);
		System.out.println(map2);
		
		// map2의 listRe 에 list put
//		map2.put("listRe", list1);
//		System.out.println("map2 : " + map2.get("listRe"));
		
		
		List<Object> list2 = new ArrayList<Object>();			 // List
		//list2.add(map2.get("listRe"));
		//System.out.println(list2.get(0));
		
	} //main
}//class
