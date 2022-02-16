package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WaysToIterateArrayList {

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
		
		System.out.println("Using normal forloop.....");
		for(int i=0; i<cities.size(); i++)
		{
			System.out.println(cities.get(i));
		}
		
		System.out.println("Using enhanced for loop....");
		for(String str : cities)
		{
			System.out.println(str);
		}
		
		System.out.println("Using iterator....");
		Iterator<String> it = cities.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Using listIterator....");
		ListIterator<String> lit = cities.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("Using forEach method and it's introduced in java8....");
		cities.forEach(s -> System.out.println(s));
		
		System.out.println("Using stream API forEach and it's introduced in java8....");
		cities.stream().forEach(s -> System.out.println(s));
	}
}
