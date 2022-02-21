package java8.functional;

@FunctionalInterface
interface Test
{
	public void add(int a, int b);
	
	default void test1()
	{
		System.out.println("test1 method");
	}
	
	static void test2()
	{
		System.out.println("test2 method");
	}
	
	static void test3()
	{
		System.out.println("test3 method");
	}
	
}

public class FunctionalInterfaceExample1 {

	public static void main(String[] args) {
		
		
	}
}
