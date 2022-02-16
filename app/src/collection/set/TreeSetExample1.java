package collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<String>();

		set.add("Ram");
		set.add("Raj");
		set.add("Sandeep");
		set.add("Hemanth");
		set.add("Rak");
		set.add("Ram");
		set.add("Arun");

		System.out.println(set);
	}
}
