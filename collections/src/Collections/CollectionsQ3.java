package Collections;
import java.util.*;
class employee{
	public String getname() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public int getId() {
		return id;
	}
	public String getDep() {
		return dep;
	}
	int id;
	String name;
	int salary;
	String dep;
	public employee(int id,String name,String dep,int salary) {
		super();
		this.id= id;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}
}
class nameComp implements Comparator<employee>{
	public int compare(employee e1, employee e2) {
		return e1.getname().compareTo(e2.name);
	}
}
class depComp implements Comparator<employee>{
	public int compare(employee e1,employee e2) {
		return e1.getDep().compareTo(e2.getDep());
	}
}
class idComp implements Comparator<employee>{
	 
  
    public int compare(employee e1, employee e2) {
    	return e1.getId()-e2.getId();
    }
}
class SalaryComp implements Comparator<employee>{
	 
  
    public int compare(employee e1, employee e2) {
    	return e1.getSalary()-e2.getSalary();
    }
}

public class CollectionsQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1 = new employee(1,"Yogesh","Cse",5000);
		employee e2 = new employee(2,"Sanjay","Cse",9000);
		employee e3 = new employee(3,"Shivani","Cse",10000);
		System.out.println("Choose the option\n"+"1.for ID \n"+"2.for name \n"+"3.for department \n"+"4.for salary\n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==4)
			{
				Set<employee> e= new TreeSet<>(new SalaryComp());
				e.add(e1);
				e.add(e2);
				e.add(e3);
				for(employee i:e)
				{
					System.out.println(i.id+" "+i.name+" "+i.dep+" "+i.salary);
				}
			}
			if(n==1)
			{
				Set<employee> e = new TreeSet<>(new idComp());
				e.add(e1);
				e.add(e2);
				e.add(e3);
				for(employee i:e)
				{
					System.out.println(i.id+" "+i.name+" "+i.dep+" "+i.salary );
				}
			}
			if(n==2)
			{
				Set<employee> e = new TreeSet<>(new nameComp());
				e.add(e1);
				e.add(e2);
				e.add(e3);
				for(employee i:e)
				{
					System.out.println(i.id+" "+i.name+" "+i.dep+" "+i.salary );
				}
			}
			if(n==3)
			{
				Set<employee> e = new TreeSet<>(new depComp());
				e.add(e1);
				e.add(e2);
				e.add(e3);
				for(employee i:e)
				{
					System.out.println(i.id+" "+i.name+" "+i.dep+" "+i.salary );
				}
			}
		}

	}


