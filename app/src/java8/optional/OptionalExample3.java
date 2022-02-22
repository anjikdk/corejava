package java8.optional;

import java.util.Optional;

public class OptionalExample3 {

	public static void main(String[] args) {
		
		Optional<String> op = Optional.empty();
		
		System.out.println(op);
		
		if(op.isPresent())
		{
			System.out.println(op.get());
		}
		op.ifPresent(a -> System.out.println(a));
		
		Optional<String> op1 = Optional.of("abc");
		op1.ifPresent(a -> System.out.println(a));
		
		
	}
}
