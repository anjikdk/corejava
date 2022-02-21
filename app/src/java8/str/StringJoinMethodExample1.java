package java8.str;

import java.util.ArrayList;
import java.util.List;

public class StringJoinMethodExample1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Hyd");
		list.add("Blr");
		list.add("Chennai");
		list.add("Vizag");
		
		System.out.println(list);
		
		
		// Before java8
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<list.size(); i++)
		{
			if(list.size()-1 <= i)
			{
				sb.append(list.get(i));
			}
			else
			{
				sb.append(list.get(i));
				sb.append("#");
			}
		}
		System.out.println(sb);

		// From java8
		String str = String.join(",", list);
		System.out.println(str);
	}
}
