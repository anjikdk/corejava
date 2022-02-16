package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {

		List<String> cities = new ArrayList<String>();

		cities.add("Hyd");
		cities.add("Blr");
		cities.add("Chennai");
		cities.add("Vizag");
		cities.add("Bellary");
		cities.add("ATP");
		cities.add("Vijayawada");
		cities.add("Hubli");
		cities.add("Darwada");

		System.out.println(cities);
		
//		cities.clear();
//		System.out.println(cities);
		
		boolean b = cities.isEmpty();
		System.out.println(b);
		
		List<String> subList = cities.subList(6, cities.size());
		System.out.println(subList);
		
		
	}
}
