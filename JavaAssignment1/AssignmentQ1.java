
import java.util.*;
import java.lang.Math;
class ArmstrongOrNot{
	public boolean armstrongCheck(int num) {
		int temp,start=0,last=0,sum=0;
		temp=num;
		while(temp>0) {
			temp=temp/10;
			start++;
		}
		temp=num;
		while(temp>0)
		{
			last=temp%10;
			sum+=(Math.pow(last,start));
			temp=temp/10;
		}
		if(num==sum)
			return true;
		else 
			return false;
	}
}
public class AssignmentQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        ArmstrongOrNot obj = new ArmstrongOrNot();
        
         if(obj.armstrongCheck(num))
        	 System.out.print(num+" is Armstrong Number");
         else
        	 System.out.print(num+ " is Not an an Armstrong Number");
        	
	}

}
