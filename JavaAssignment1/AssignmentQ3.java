import java.util.*;
class SICI{
	public double simpleInterest(double principalAmount,int time,double interestRate) {
		double simple;
		simple=((principalAmount*time*interestRate)/100);
		return simple;
	}
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double compoundInterest;
    	compoundInterest=(principalAmount*(Math.pow(1+interestRate,time))-principalAmount);
    	return compoundInterest;
    }
    
}
public class AssignmentQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SICI obj = new SICI();
		Scanner sc = new Scanner(System.in);
		double p=sc.nextDouble();
		int t=sc.nextInt();
		double r =sc.nextDouble();
		System.out.print(obj.simpleInterest(p, t, r)+ "\n");
		System.out.print(obj.compoundInterest(p, t, r));
				
	}

}
