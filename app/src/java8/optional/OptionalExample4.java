package java8.optional;

import java.util.Optional;

public class OptionalExample4 {

	public static void main(String[] args) {
		
		String s = "abc";
		Optional<String> op = Optional.of(s);
		System.out.println(op.get());
		
		Integer i = 20;
		Optional<Integer> op1 = Optional.of(i);
		System.out.println(op1.get());
	}
}

