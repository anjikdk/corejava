package string;

public class StringExample {

	public static void main(String[] args) {
		
//		String s = new String("Chennai Bangalore Hyderabad");
		
		String s = "Bangalore";
		
		int count = s.length();
		System.out.println(count);
		
		String password = "Rajesh122434234324";
		
		if(password.length() >= 8 && password.length() < 12)
		{
			System.out.println("Password is allowed...");
		}
		else
		{
			System.out.println("Password Not allowed...");
		}
		
		String str = "RAM";
		String lowerCase = str.toLowerCase();
		System.out.println(lowerCase); // ram
		
		
		String upperCase = lowerCase.toUpperCase();
		System.out.println(upperCase);
		
		String str1 = "Bangalore";
		char c = str1.charAt(5);
		System.out.println(c);
		
		
		String fname = "Rakesh";
		String lname = "Raj";
		
		String name = fname.concat(" "+lname);
		System.out.println(name);
		
		String data = "Vizag#Blr#Chennai#Hyd#Delhi#ATP#Chittor";
		String str3[] = data.split("#");
		for(int i=0; i<str3.length; i++)
		{
			System.out.println(str3[i]);
		}
	}
}
