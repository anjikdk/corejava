package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethodsExample1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(10, "abc");
		map.put(11, "Ram");
		map.put(12, "Raj");
		map.put(13, "Arun");
		map.put(14, "Bala");
		
		System.out.println(map);
		
		String value = map.get(13);
		System.out.println(value); // Arun
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		boolean b = map.containsKey(10);
		System.out.println(b);
		
		boolean b1 = map.containsValue("Ram");
		System.out.println(b1);
		
//		map.clear();
//		System.out.println(map);
		
		boolean b2 = map.isEmpty();
		System.out.println(b2);
		
		map.remove(10);
		System.out.println(map);
		
		map.replace(11, "Rakesh");
		System.out.println(map);
		
		
	}
}
