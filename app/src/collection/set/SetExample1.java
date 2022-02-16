package collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("Ram");
		set.add("Raj");
		set.add("Sandeep");
		set.add("Hemanth");
		set.add("Rak");
		set.add("Ram");

		System.out.println(set);
		
		
	}
}
