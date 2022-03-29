package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;

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
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		
		LinkedList<String> list = new LinkedList<String>(); // TODO: DTO Type 넣어볼것.
		
		for (int i = 0; i < array.size(); i++) {
			JSONObject parsing = (JSONObject) array.get(i);
			
			map.put("location" ,(String) parsing.get("location"));
			map.put("value" ,(String) parsing.get("value"));
			
			list.add(i,(String) parsing.get("location"));
			list.add(i,(String) parsing.get("value"));

		}// for

		System.out.println(map.get("location"));
		System.out.println(list);
		
	}//main
}//class
