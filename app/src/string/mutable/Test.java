package string.mutable;

public class Test {

	public static void main(String[] args) {
		
		String name = "  Rajesh"; // 100
		System.out.println(name.hashCode());
		System.out.println(name);
		
		name = name.trim(); // 101
		System.out.println(name.hashCode());
		
		System.out.println(name);
	}
}
