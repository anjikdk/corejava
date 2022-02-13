package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissmatchExcpetionExample {

	public static void main(String[] args) {
		
		System.out.println("main method start"); // printf(""); // scanf()
		
		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		
		try
		{
			int k = sc.nextInt();
			System.out.println(k);
		}
		catch (InputMismatchException e) {
			e.printStackTrace();
		}
		
		System.out.println("main method end");
	}
}
