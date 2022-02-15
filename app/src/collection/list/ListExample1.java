package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); // auto upcasting
		
		list.add("bbb");
		list.add("abc");
		list.add("xyz");
		list.add("aaa");
		list.add("ccc");
		list.add("bbb");
		
		System.out.println(list);
	}
}
