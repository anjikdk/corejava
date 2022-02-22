package java8.lamda;

interface Addition
{
	public int add(int i, int j);
}

public class LamdaExample1 {

	public static void main(String[] args) {
		
		Addition a = (i, j) -> i+j;
		System.out.println(a.add(50, 20));
	}
}
