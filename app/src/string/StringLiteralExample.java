package string;

public class StringLiteralExample {

	public static void main(String[] args) {
		
		String s = "Bangalore"; // Stringpool
		String s1 = "Bangalore";
		
		System.out.println(s == s1); // false
		
		String s2 = new String("Bangalore"); // If use new keyword for the object creation then always will create object
		
		System.out.println(s == s2); // false
		
		System.out.println(s.equals(s2)); // true
		
		// == operator it will check objects are same or not
		// equals method will check content same or not
		
		
		String s3 = new String("bangalore");
		System.out.println(s.equalsIgnoreCase(s3)); // true
	}
}
