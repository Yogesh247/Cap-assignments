class ArmstrongNumBetweenRange{
    public void armstrongNumbersInRange(int min , int max){
    	int n,sum=0;
    	
    		n=min;
    		while(n!=0) {
    			int last=n%10;
    			sum=sum+(last*last*last);
    			n=n/10;
    		}
    		if(sum==min)
    			System.out.print(sum+" ");
    	
    }

}
public class AssignmentQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=100;
		int max=999;
		ArmstrongNumBetweenRange obj=new ArmstrongNumBetweenRange();
		for(int i=min;i<=max;i++) {
		obj.armstrongNumbersInRange(i,max);
		}
	}

}
