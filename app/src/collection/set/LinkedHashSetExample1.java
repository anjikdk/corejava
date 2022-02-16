package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample1 {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();

		set.add("Ram");
		set.add("Raj");
		set.add("Sandeep");
		set.add("Hemanth");
		set.add("Rak");
		set.add("Ram");

		System.out.println(set);
		
		// To remove un used imports --> ctrl+shift+o
	}
}
