package LamdaAssignment;
interface operation{
	int operations(int a,int b);
}
public class LamdaQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation add = (a, b)->(a+b);
		System.out.println("Addition is "+add.operations(5,10));
		operation sub = (a, b)->(a-b);
		System.out.println("Subtraction is "+sub.operations(5,10));
		operation mul = (a, b)->(a*b);
		System.out.println("Multiplication is "+mul.operations(5,10));
		operation div = (a, b)->(a/b);
		System.out.println("Division is "+div.operations(5,10));
	}

}
