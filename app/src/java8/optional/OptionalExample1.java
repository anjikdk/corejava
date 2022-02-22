package java8.optional;

import java.util.Optional;

public class OptionalExample1 {

	public static void main(String[] args) {
		
//		Optional<String> op = Optional.of(null);
//		System.out.println(op);
		
		Optional<String> op1 = Optional.ofNullable(null);
		System.out.println(op1);
		
//		if(op1.isPresent())
//		{
//			System.out.println(op1.get());
//		}
//		else
//		{
//			System.out.println("No element...");
//		}
		
//		op1.ifPresentOrElse(a -> System.out.println("Data"+ a), () -> System.out.println("No element"));
//		
//		op1.ifPresentOrElse(x -> System.out.println("Value: " + x), () ->
//        System.out.println("Not Present"));
		
		
		
	}
}
