import java.util.Scanner;

public class Assignment1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		Scanner sc=new Scanner(System.in);
		
		outerloop:
		for(int i=0;i<3;i++)
		{
		 String userId = "Ajay" ,password =  "Password" ;
		 System.out.println("Enter userid");
		 String user =sc.next();
		 System.out.println("Enter password");
		 String pass =sc.next();
		
		 count++;
		
		
		 while(count<3) 
		 {
		   if (user.equals(userId) && pass.equals(password))
			 {
				 System.out.println(" Welcome Ajay");
				 break outerloop;
			 }
		   
		   if(!user.equals(userId) || !pass.equals(password))
			 {
				 System.out.println(" You have entered wrong credentials ,please enter the right credentials.");
				 break;
				 
			 }
		 }
		 if(count == 3)
		  {
			  if(!user.equals(userId) || !password.equals(password))
			  {
				  System.out.println("You have entered wrong credentials 3 times");
				  System.out.println("Contact Admin");
				  
			  }
		  }
	 }
	}

}
