package GenericsAssignment;
import java.util.*;
class Employee{
	 int id;
	 String name;
	 float salary;
	 String department;
	public  Employee(int id,String name, int salary,String department){
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		
	}
	public void displaydetails() {
		System.out.println(id+ " "+name+" "+salary+" "+department);
	}
	}
class demo{
	int id;
	demo(int a){
		this.id=a;
	}
	void display() {
		System.out.println(id);
	}
}

public class GenericsQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> h = new HashSet<>();
		Employee e = new Employee(1,"Yogesh",200000,"Cse");
		
		h.add(e);
		for(Employee s:h) {
			s.displaydetails();
		}
	}

}
