package stringbuffer;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();

		// concat equalant method is append

		sb.append("Rakesh");
		sb.append(" Raj");

		System.out.println(sb);
		
		
		sb.reverse();
		System.out.println(sb);

	}
}
