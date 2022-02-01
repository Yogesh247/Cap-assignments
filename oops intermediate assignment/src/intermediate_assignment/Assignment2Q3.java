package intermediate_assignment;

import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    
    int creditLimit = 2000;
    @Override
    public int getCash(int totalDeposits) {
    	return totalDeposits+creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    
    int fixedDepositAmount = 5000;
    @Override
    public int getCash(int totalDeposits) {
    	return totalDeposits+fixedDepositAmount;
    }
}
public class Assignment2Q3 {
	int totalDeposits = 10000;
	public int getCash(int totalDeposits){
		
		return totalDeposits;
	}
	public int totalCashInBank(ArrayList<Integer> cash){
		int sum = 0;
		for(int i=0; i<cash.size();i++)
			sum += cash.get(i);
		return sum;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount obj1 = new CurrentAccount();
		SavingsAccount obj2 = new SavingsAccount();
		System.out.println(obj1.getCash(obj1.totalDeposits));
		System.out.println(obj2.getCash(obj2.totalDeposits));
	}

}
