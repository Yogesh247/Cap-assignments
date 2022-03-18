package exceptionhandling;

import java.util.Scanner;

public class ExceptionhandlingQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int a =sc.nextInt();
		int b = sc.nextInt();
		try {
			int res = divide(a,b);
			System.out.println(res);
		}
		catch(UnsupportedOperationException e) {
			System.out.println("Invalid division");
			System.out.println(e);
		}
		finally {
			System.out.println("Normal flow of code");
			sc.close();
		}
	}
		
		public static int divide(int num1,int num2) {
			if(num2==0) {
				throw new UnsupportedOperationException("Denominator is zero");
			}
			int c=num1/num2;
			return c;
		}
		
	}


