package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {

	public static void main(String[] args) throws ParseException, IOException {
		
		JSONObject obj = new JSONObject();		// 전송할 JSON object 
		JSONObject json1 = new JSONObject();	// JSON 타입 추가할 object 
		JSONArray arr = new JSONArray();		// JSON 타입 List 
		
		
		for (int i = 0; i < 3; i++) {
			
			json1.put("first", "Kang_" + i);
			json1.put("last", "sj_" + i);
			
			arr.add(json1);
		}
		
		System.out.println("Array : " + arr);
		
		obj.put("TYPE", arr);	// JSON DATA의 이름은 TYPE. data => arr(json List TYPE)
		
		System.out.println("Object : " + obj);
		System.out.println();

		JSONArray arr2 = (JSONArray)obj.get("TYPE");	//JSONObject -> (casting) JSONArray = TYPE을 LIST로 
		for (int i = 0; i < arr2.size(); i++) {
			JSONObject resObj = (JSONObject) arr2.get(i); // i 번째데이터를 resObj 타입으로 casting -> i번쨰 키값(firtst, last) 가져오기
			System.out.println(i + "번 first : " + resObj.get("first"));
			System.out.println(i + "번 last : " + resObj.get("last"));
		}
		
		System.out.println();
		//-----------------------------------JSON data put-----------------------------------------v
		
		
		//FileReader file = new FileReader("json/exam.json");
		JSONParser parser = new JSONParser();

		Object ob = new JSONParser().parse(new FileReader("/Users/seokjunkang/java_project/data structure/src/json/exam.json")); 
		JSONObject jso = (JSONObject)ob;
		
		System.out.println("result : " + jso.get("subject"));
		
		
		System.out.println();
		//-----------------------------------JSON data put-----------------------------------------v
		
		//JSON으로 Parsing할 문자열 데이터
        String jsonStr = "{\"members\":["
                + "{\"name\":\"홍길동\","
                + "\"email\":\"gildong@hong.com\","
                + "\"age\":\"25\""
                + "},"
                + "{\"name\":\"홍길서\","
                + "\"email\":\"gilseo@hong.com\","
                + "\"age\":\"23\""
                + "}]}";

        try {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonStr); // String -> JSON
            JSONArray memberArray = (JSONArray) jsonObj.get("members");	 // JSON key(members) -> JSONArray 변환

            System.out.println("=====Members=====");
            for(int i=0 ; i<memberArray.size() ; i++){
                JSONObject tempObj = (JSONObject) memberArray.get(i);
                System.out.println(""+(i+1)+"번째 멤버의 이름 : "+tempObj.get("name"));
                System.out.println(""+(i+1)+"번째 멤버의 이메일 : "+tempObj.get("email"));
                System.out.println(""+(i+1)+"번째 멤버의 나이 : "+tempObj.get("age"));
                System.out.println("----------------------------");
            }

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		
	} //main
}//class
