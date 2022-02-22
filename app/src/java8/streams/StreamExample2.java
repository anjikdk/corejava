package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamExample2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(10);
		list.add(5);
		list.add(200);
		
		Optional<Integer> op2 = list.stream().findAny();
		System.out.println(op2.get());
		
		Optional<Integer> op3 = list.stream().findFirst();
		System.out.println(op3.get());
		
		
		Optional<Integer> op = list.stream().max((a,b) -> a.compareTo(b));
		System.out.println(op.get());
		
		Optional<Integer> op1 = list.stream().min((a,b) -> a.compareTo(b));
		System.out.println(op1.get());
		
	}
}
