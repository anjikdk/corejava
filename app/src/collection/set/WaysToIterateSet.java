package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class WaysToIterateSet {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<String>();

		set.add("Ram");
		set.add("Raj");
		set.add("Sandeep");
		set.add("Hemanth");
		set.add("Rak");
		set.add("Ram");

		System.out.println(set);
		
		System.out.println("Using enhanced forloop....");
		for(String str : set)
		{
			System.out.println(str);
		}
		
		System.out.println("Using iterator....");
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Using forEach...");
		set.forEach(s -> System.out.println(s));
		
		System.out.println("Using stream API forEach...");
		set.stream().forEach(s -> System.out.println(s));
	}
}
