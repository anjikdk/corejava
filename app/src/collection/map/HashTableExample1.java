package collection.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample1 {

	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<String, String>();

		map.put("e", "eee");
		map.put("f", "fff");
		map.put("g", "ggg");
		map.put("a", "abc");
		map.put("x", "xyz");
		map.put("B", "bbb");
		map.put("c", "ccc");
		map.put("D", "ddd");
//		map.put(null, null);
//		map.put("abc", null);

		System.out.println(map);
	}
}
