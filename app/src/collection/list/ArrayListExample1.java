package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

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
		
		for(int i=0; i<cities.size(); i++)
		{
			if(cities.get(i).startsWith("A") || cities.get(i).startsWith("B"))
			{
				System.out.println(cities.get(i));
			}
		}
		
		cities.remove("ATP");
		System.out.println(cities);
		
		cities.add(5, "Mysore");
		System.out.println(cities);
		
//		cities.clear();
		
		System.out.println(cities);
		
		boolean b = cities.contains("Hyd");
		System.out.println(b);
		
	}
}
