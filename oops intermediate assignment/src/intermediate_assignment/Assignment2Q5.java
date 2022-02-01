package intermediate_assignment;
class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	return "Rectangle";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "Line";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "Cube5";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape5 obj1 = new Rectangle5();
		Shape5 obj2 = new Line5();
		Shape5 obj3 = new Cube5();
		
		System.out.println(obj1.draw());
		System.out.println(obj2.draw());
		System.out.println(obj3.draw());
		

		
		

	}

}
