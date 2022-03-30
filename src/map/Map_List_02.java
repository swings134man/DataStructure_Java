package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : map 내부에 List 삽입 
 * @File    : Map_List_02.java
 * @Package : map
 * @author  : seokjunkang
 * @Date    : 2022. 3. 31. 오전 12:14:09
 */
public class Map_List_02 {

	public static void main(String[] args) {
		
		// Map에 Data를 넣은 뒤 List에 담는 로직
		Map<String, Object> map1 = new HashMap<String, Object>();
			map1.put("key1", "val1");
			map1.put("key2", "val2");
		
		List<Object> list1 = new ArrayList<Object>(); 
			list1.add(map1);
		
		// map에 list 담는 로직
		Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put("first", list1);
		
		// 출력 
		Map<String, Object> showMap01 = new HashMap<String, Object>();
		showMap01 = (Map<String, Object>) list1.get(0);
		
		System.out.println("Map : " + resultMap.get("first")); // map에 담겨있는 list 조회
		System.out.println("List to Map : " + showMap01); 
	} // main
} // class
