package intermediate_assignment;
import java.util.*;
class Manager extends Assignment2Q2{
	public int getSalary(int salary) {
		int incentive =5000;
		return incentive+salary;
	}
}
class Labour extends Assignment2Q2{
	public int getSalary(int salary) {
		int overtime = 500;
		return overtime+salary;
	}
}
public class Assignment2Q2 {
	int salary = 10000;
	public int getSalary(int salary) {
		return salary;
	}

	
		// TODO Auto-generated method stub
		public int totalEmployeeSalary(ArrayList<Integer> es){
			int sum = 0;
			for(int i=0;i<es.size();i++)
				sum +=es.get(i);
			return sum;
		}	
			public static void main(String[] args) {
				Labour obj1 = new Labour();
				Manager obj2 = new Manager();
				System.out.println(obj1.getSalary(obj1.salary));
				System.out.println(obj2.getSalary(obj2.salary));
				
	}
}
