package collection.listset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ConvertFromListToSetExample {

	public static void main(String[] args) {
		
		List<String> cities = getCities();
		System.out.println(cities);
		
		// Convert from List to Set
		Set<String> citiesSet = new TreeSet<String>(cities);
		System.out.println(citiesSet);
		
		// Convert from Set to List
		List<String> citiesList = new ArrayList<String>(citiesSet);
		
		Collections.reverse(citiesList);
		
		System.out.println(citiesList);
		
	}
	
	// Existing method
	public static List<String> getCities()
	{
		List<String> cities= new ArrayList<String>();
		
		cities.add("Blr");
		cities.add("Hyd");
		cities.add("Chennai");
		cities.add("Bellary");
		cities.add("Blr");
		cities.add("Hyd");
		
		
		return cities;
	}
}
