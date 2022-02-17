package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(15, "abc");
		map.put(16, "abc");
		map.put(17, "abc");
		map.put(18, "abc");
		map.put(10, "abc");
		map.put(11, "abc");
		map.put(6, "abc");
		map.put(1, "abc");
		map.put(2, "aaa");
		map.put(3, "bbb");
		map.put(4, "ccc");
		map.put(5, "abc");
		map.put(1, "Ram");
		map.put(7, "abc");
		map.put(8, "abc");
		map.put(9, "abc");
		map.put(12, "abc");
		map.put(13, "abc");
		map.put(14, "abc");
		
		
		System.out.println(map);
	}
}
