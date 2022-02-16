package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();

		list1.add("ATP");
		list1.add("Kurnool");
		list1.add("Chittor");
		list1.add("Kadapa");

		List<String> list2 = new ArrayList<String>();

		list2.add("Blr");
		list2.add("Hyd");
		list2.add("Vizag");
		list2.add("Chennai");

		System.out.println(list1);
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
		
//		list1.removeAll(list2);
		System.out.println(list1);
		
		
		list1.retainAll(list2);
		System.out.println(list1);
		
		// list1.removeAll(list2);  --> Removing list2 elements from list1
		// list1.retainAll(list2);  --> Keeping list2 elements and removing others
		
	}
}

