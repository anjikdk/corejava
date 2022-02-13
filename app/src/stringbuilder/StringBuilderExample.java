package stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		// concat equalant method is append
		
		sb.append("Rakesh");
		sb.append(" Raj");
		
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
	}
}
