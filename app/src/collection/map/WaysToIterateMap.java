package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WaysToIterateMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(10, "abc");
		map.put(11, "Ram");
		map.put(12, "Raj");
		map.put(13, "Arun");
		map.put(14, "Bala");

		System.out.println(map);
		
		System.out.println("Using keyset with enhanced forloop...");
		Set<Integer> keys = map.keySet();
		for(Integer key : keys)
		{
			System.out.println(key + " - "+ map.get(key));
		}
		
		System.out.println("Using keyset with iterator..");
		Set<Integer> keys1 = map.keySet();
		Iterator<Integer> it = keys1.iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			System.out.println(key+" - " + map.get(key));
		}
		
		System.out.println("Using entrySet with enhnaced forloop...");
		Set<Entry<Integer, String>> entries = map.entrySet();
		for(Entry<Integer, String> entry : entries)
		{
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
		System.out.println("Using entrySet with iterator...");
		Set<Entry<Integer, String>> entries1 = map.entrySet();
		Iterator<Entry<Integer, String>> entryIts = entries1.iterator();
		while(entryIts.hasNext())
		{
			Entry<Integer, String> entry = entryIts.next();
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
		System.out.println("Using forEach...");
		map.forEach((key,value) -> System.out.println(key+" - "+value));
		
	}
}
