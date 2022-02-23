package java8.methodreference;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceExample1
{
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
		
		System.out.println("Using java8 forEach method with lamda...");
		cities.forEach(s -> System.out.println(s));
		
		System.out.println("Using java8 method Reference...");
		cities.forEach(System.out::println);
	}
}
