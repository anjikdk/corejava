package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample1 {

	public static void main(String[] args) {

		Map<String, String> map = new LinkedHashMap<String, String>();

		map.put("e", "eee");
		map.put("f", "fff");
		map.put("g", "ggg");
		map.put("a", "abc");
		map.put("x", "xyz");
		map.put("B", "bbb");
		map.put("c", "ccc");
		map.put("D", "ddd");
		map.put(null, null);
		map.put("abc", null);

		System.out.println(map);
	}
}
