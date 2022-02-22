package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {

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
		
//		for(String s : cities)
//		{
//			if(s.startsWith("H"))
//			{
//				System.out.println(s);
//			}
//		}
		
//		cities.stream().filter(s -> s.startsWith("H")).forEach(a -> System.out.println(a));
		
		List<String> citiesStartWithH = cities.stream().filter(s -> s.startsWith("H")).collect(Collectors.toList());
		System.out.println(citiesStartWithH);
		
		long count = cities.stream().count();
		System.out.println(count);
		
		long count1 = cities.stream().filter(s -> s.startsWith("H")).count();
		System.out.println(count1);
		
		List<String> citiesWithUpperCase = cities.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(citiesWithUpperCase);
		
	}
}
