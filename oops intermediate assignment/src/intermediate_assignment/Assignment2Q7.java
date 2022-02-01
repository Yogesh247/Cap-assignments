package intermediate_assignment;
import java.util.*;
abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
	int price = 10;
	int sum = 0;
    public int addCandies(int candies){
    	sum += candies;
    	return sum;
    	
    }
    public int getCost() {
    	return (price*60);
    }
}
class Cookie extends DesertItem {
    int price = 50;
    int sum = 0;
	public int addCookies(int candies){
    	sum += candies;
    	return sum;
    }
	public int getCost() {
		return (price*70);
	}
}
class IceCream extends DesertItem {
	int price = 30;
	int sum = 0;
    public int addIceCreams(int candies){
    	sum += candies;
    	return sum;
    }
    public int getCost() {
    	return (price);
    }
}
public class Assignment2Q7 {
	Scanner sc = new Scanner(System.in);
	private void role() {
		System.out.println("Enter the role 0 for Owner and 1 for Customer");
		int x = sc.nextInt();
		if(x==0)
			roleassigned("Owner");
		else if(x==1)
			roleassigned("Customer");
		else 
			System.out.println("Please enter the valid code for role");
	}
	private void roleassigned(String role) {
		if(role=="Owner") {
			addItems();
		}
		else
		{
			placeOrder();
		}
	}
	private void addItems() {
		System.out.println("Add Your choices"+'\n'+"1. Candy"+'\n'+ "2. Cookie"+'\n'+"3. Ice Cream");
		addchoice(sc.nextInt());
	}
	private void addchoice(int choice) {
		System.out.println("Enter the number of item");
		int n = sc.nextInt();
		if(choice==1) {
			Candy obj = new Candy();
			obj.addCandies(n);
		}
		else if(choice==2)
		{
			Cookie obj = new Cookie();
			obj.addCookies(n);
	}
		else if(choice==3)
		{
			IceCream obj = new IceCream();
			obj.addIceCreams(n);
		}
		else
			System.out.println("Enter valid input");
		role();
		}
	private void placeOrder() {
		System.out.println("Add Your choices"+'\n'+"1. Candy"+'\n'+ "2. Cookie"+'\n'+"3. Ice Cream");
		placeitem(sc.nextInt());
	}
	private void placeitem(int choice) {
	System.out.println("Enter the number of items you want to buy");
	int n = sc.nextInt();
	if(choice==1)
	{
	Candy obj = new Candy();
	System.out.println("Total price is"+ (n*obj.getCost()));
	}
	else if(choice==2) {
		Cookie obj = new Cookie();
		System.out.println("Total price is"+ (n*obj.getCost()));
	}
	else if(choice==3) {
		IceCream obj = new IceCream();
		System.out.println("Total price is"+ (n*obj.getCost()));
	}
	else 
		System.out.println("Enter valid input");
	role();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2Q7 obj = new Assignment2Q7();
		obj.role();
			
		}
	}


