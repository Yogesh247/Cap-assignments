package Collections;
import java.util.*;
enum gender{
	MALE,FEMALE;
}
class contact{
	long phone;
	String name;
	String email;
	gender gen;
	public contact(long phone,String name,String email,gender gen) {
		super();
		this.phone = phone;
		this.name = name;
		this.email = email;
		this.gen = gen;
	}
}

public class collectionsQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contact y = new contact(7405858,"Yogesh","yk@gmail.com",gender.MALE);
		contact s = new contact(9745475,"Shivani","s@gmail.com",gender.FEMALE);
		contact s1 = new contact(854625,"Sanjay","San@gmail.com",gender.MALE);
		TreeMap<Long,contact> t = new TreeMap<>(Collections.reverseOrder());
		t.put(y.phone, y);
		t.put(s.phone, s);
		t.put(s1.phone, s1);
		for(Map.Entry<Long,contact>e:t.entrySet()) {
			System.out.println(e.getKey());
		}
		System.out.println("Values");
		for(Map.Entry<Long,contact> e:t.entrySet())
		{
			contact c= e.getValue();
			System.out.println(c.phone+ " "+c.name+" "+c.email+" "+c.gen);
		}
	}

}
