package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : JSON, Map 적용 클래스
 * @File    : Json2.java
 * @Package : json
 * @author  : seokjunkang
 * @Date    : 2022. 3. 30. 오전 3:48:21
 */
public class Json2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		Object object = new JSONParser().parse(new FileReader("/Users/seokjunkang/java_project/data structure/src/json/exam2.json"));
		
		JSONObject json = (JSONObject) object; // object -> JSONObject
		JSONArray array = (JSONArray) json.get("key");
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		
		LinkedList<String> list = new LinkedList<String>(); // TODO: DTO Type 넣어볼것.
		
		List<String> jsonList = new ArrayList<String>(); // map에 넣을 list 객체
		
		for (int i = 0; i < array.size(); i++) {
			JSONObject parsing = (JSONObject) array.get(i);
			
			map.put("location" ,(String) parsing.get("location"));
			map.put("value" ,(String) parsing.get("value"));
			
//			jsonList.add((String) parsing.get("location"));
			
			list.add(i,(String) parsing.get("location"));
			list.add(i,(String) parsing.get("value"));
			
			map.put("location" , list);

		}// for

		System.out.println(map.get("location"));
		System.out.println(list);
		
	}//main
}//class
