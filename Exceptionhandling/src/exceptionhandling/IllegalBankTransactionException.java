package exceptionhandling;

public class IllegalBankTransactionException extends Exception{
	private static final long serialVersionExceptionUID = 1L;
	public IllegalBankTransactionException(String a)
	{
		super(a);
	}

}
