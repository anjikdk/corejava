package java8.methodreference;

interface Test
{
	public void test();
}

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		
		Test t = MethodReferenceExample2::test1;
		t.test();
	}
	
	
	public static void test1()
	{
		System.out.println("test1 method");
	}
}
