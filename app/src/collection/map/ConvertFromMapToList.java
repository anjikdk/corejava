package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConvertFromMapToList {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(10, "abc");
		map.put(11, "Ram");
		map.put(12, "Raj");
		map.put(13, "Arun");
		map.put(14, "Bala");

		System.out.println(map);
		
		List<String> valuesList = new ArrayList<>();
		List<Integer> keysList = new ArrayList<>();
		
		Set<Integer> keys = map.keySet();
		for(Integer key : keys)
		{
			keysList.add(key);
			valuesList.add(map.get(key));
		}
		
		System.out.println(keysList); // keys
		System.out.println(valuesList); // values
	}
}
