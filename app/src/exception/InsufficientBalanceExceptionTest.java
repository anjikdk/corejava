package exception;

public class InsufficientBalanceExceptionTest {

	public static void main(String[] args) {

		int balance = 5000;
		int withdraw = 4000;

		if(balance < withdraw)
		{
			// throw is mainly for raising the Exception explicitly
			throw new InsufficientBalanceException("Insufficient funds...");
		}
		else
		{
			System.out.println("Withdraw amount succesfull..");
			// Updating bank balance
		}
	}
}
