package java8.optional;

import java.util.Optional;

public class OptionalExample1 {

	public static void main(String[] args) {
		
		Optional<String> op = Optional.empty();
		
		System.out.println(op);
		
		if(op.isPresent())
		{
			System.out.println(op.get());
		}
		else
		{
			System.out.println("Optional class is empty");
		}
		
		
		System.out.println(op.ifPresentOrElse());
		
		
	}
}
