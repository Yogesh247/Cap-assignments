package Collections;
import java.util.*;
import java.time.*;
class date
{
	LocalDate d;
	public date(int a,int b,int c) {
		super();
		this.d = LocalDate.of(a, b, c);
	}
	public LocalDate get()
	{
		return d;
	}
}
public class collectionQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		date d=new date(2004,12,15);
		date n=new date(2001,12,15);
		date m=new date(2008,12,15);
		date c=new date(2006,12,15);
		LinkedList<date> l= new LinkedList<>();
		l.add(d);
		l.add(n);
		l.add(m);
		l.add(c);
		Iterator<date> tr = l.descendingIterator();
		while(tr.hasNext())
		{
			date r=tr.next();
			LocalDate z = r.get();
			if(z.isLeapYear())
			
				System.out.println("Your date of birth "+ z+" was a leap year" );
			
				else
				{
					System.out.println("Your date of birth "+ z+" was not a leap year" );
				}
		}}}

			
		
	


