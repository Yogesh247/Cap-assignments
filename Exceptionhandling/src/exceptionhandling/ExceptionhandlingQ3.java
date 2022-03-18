package exceptionhandling;
import java.util.*;
class Debit{
	private int a = 5000;
	public void withdraw(int b) throws
	InsufficientBalanceException,IllegalBankTransactionException{
		if(b<0) {
			throw new IllegalBankTransactionException("Value should be positive");
		}
		else if(b>a) {
			throw new InsufficientBalanceException("Amount is exceeding with your current balance");
		}
		System.out.println(b+ "withdrawn");
	
	}
} class IllegalBankTransactionException extends Exception{
	private static final long serialVersionExceptionUID = 1L;
	public IllegalBankTransactionException(String a)
	{
		super(a);
	}
}
 class InsufficientBalanceException extends Exception{
	private static final long serialVersionUID = 1L;
	public InsufficientBalanceException(String s) {
		super(s);
	}
}

public class ExceptionhandlingQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Debit amount  =  new Debit();
		int b;
		Scanner sc  = new Scanner(System.in);
		b= sc.nextInt();
		try {
			amount.withdraw(b);
			}
		catch(IllegalBankTransactionException e) {
			System.out.println(e);
		}
		catch(InsuffientBalanceException e) {
			System.out.println(e);
		}
		

	}

}
