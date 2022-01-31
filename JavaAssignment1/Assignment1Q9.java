import java.util.*;
class Student{
int a, b, c;
	
	public Student (int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	
}

public class Assignment1Q9 {
	public static void main(String []args) 
	{
	
		Scanner sc = new Scanner(System.in);
		Student[] s = new Student[3];
		for(int i=0; i<3;i++) {
			System.out.println("enter values for a, b, c");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			s[i] = new Student(a, b, c);
		}
		
		int totalA = 0;
		int totalB = 0;
		int totalC = 0;
		
		for(Student stu: s) {
			totalA+=stu.a;
			totalB+=stu.b;
			totalC+=stu.c;
		}
		int sum=totalA+totalB+totalC;
		System.out.println("Total marks of all the students in all subjects"+" "+sum);
		System.out.println("Average marks of all the students in all subjects"+" "+sum/3);
		System.out.println("Total marks scored by students in subject A"+" "+totalA);
		System.out.println("Average marks scored by students in subject A"+" "+totalA/3);
		System.out.println("Total marks scored by students in subject B"+" "+totalB);
		System.out.println("Average marks scored by students in subject B"+" "+totalB/3);
		System.out.println("Total marks scored by students in subject C"+" "+totalC);
		System.out.println("Average marks scored by students in subject C"+" "+totalC/3);


		// TODO Auto-generated method stub

	}

}
