package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionFrameworkExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(); // String[]
		
		list.add("abc");
		list.add("aaa");
		list.add("xyz");
		list.add("xyz");
		list.add("xyz");
		list.add("xyz");
		list.add("xyz");
		list.add("xyz");
		list.add("xyz");
		list.add("xyz");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		list.remove("abc");
		
		System.out.println(list);
		
		
	}
}
