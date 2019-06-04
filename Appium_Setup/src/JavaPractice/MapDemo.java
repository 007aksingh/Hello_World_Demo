package JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class MapDemo {
	
	public static void main(String[] args) {
	
		Map<String,String> map1= new HashMap<>();
		Map<String,String> map= new TreeMap<>();
		map1.put("Name", "Rahul");
		map1.put("LName", "Yadav");
		map1.put("City", "Ghaziabad");
		map1.put("State", "UP");
		System.out.println(map1);
		map.put("Name", "Rahul");
		map.put("LName", "Yadav");
		map.put("City", "Ghaziabad");
		map.put("State", "UP");
		System.out.println(map);
		System.out.println(map.keySet());
		
		
		
	}

}
