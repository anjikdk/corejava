package java8.lamda;

interface City
{
	public String getCity();
}

public class LamdaExample2 {

	public static void main(String[] args) {
		
		City c = () -> "Bengaluru";  // Auto cupcasting
		
		System.out.println(c.getCity());
	}
}
