package exceptionhandling;
import java.util.*;
public class ExceptionhandlingQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Numbers");
		int a =sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Don't Divide by 0");
		}
	}

}
