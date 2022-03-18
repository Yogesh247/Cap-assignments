package LamdaAssignment;
import java.util.*;
import java.util.function.Predicate;
public class LamdaQ2 {
	private int totalPrice;
	private String status;
	public LamdaQ2(int totalPrice, String status)
	{
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}
	public static ArrayList<LamdaQ2> listOfOrders(ArrayList<LamdaQ2> arr, Predicate<LamdaQ2> pr) {
	ArrayList<LamdaQ2> l = new ArrayList<>();
	for(LamdaQ2 i:arr)
	{
		if(pr.test(i))
		{
			System.out.println("totalPrice:"+ i.totalPrice+"Status:"+i.status);
		}
	}
	return l;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<LamdaQ2> l = new ArrayList<>();
		l.add(new LamdaQ2(2000000,"Completed"));
		l.add(new LamdaQ2(1000,"Pending"));
		l.add(new LamdaQ2(10002,"Accepted"));
		l.add(new LamdaQ2(41025,"Completed"));
		Predicate<LamdaQ2> pr = e->(e.totalPrice>10000 && (e.status.contentEquals("Accepted")||e.status.contentEquals("Completed")));
		listOfOrders(l,pr);
	}
}
