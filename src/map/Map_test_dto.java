package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map_test_dto {

	public static void main(String[] args) {
		MapDTO dto = new MapDTO();
		dto.setId("test1");
		dto.setName("name1");
		
		HashMap<String, MapDTO> map = new HashMap<String, MapDTO>();
		map.put("mapDTO", dto);
		
		System.out.println(map.get("mapDTO"));
		//----------------------------------------------------------------------------------------
		
		//List Test
		MapDTO dto2 = new MapDTO();
		dto2.setId("test2");
		dto2.setName("name2");
		
		
		List<MapDTO> list = new ArrayList();
		list.add(dto);
		list.add(dto2);
		
		HashMap<String, List<MapDTO>> map2 = new HashMap<String, List<MapDTO>>();
		map2.put("list123", list);
		
		System.out.println(map2.get("list123"));
		System.out.println(map2.get("list123").get(1));
		
		
	}//main
}//class
