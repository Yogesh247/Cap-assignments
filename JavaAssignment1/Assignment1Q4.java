import java.util.*;
class ResultDeclaration{
	public String declareResults(double subject1Marks,double subject2Marks,double subject3Marks) {
		if(subject1Marks>60 && subject2Marks>60 && subject3Marks>60) {
			return "Passed";
		}
		else if(subject1Marks>60 && subject2Marks>60 || subject1Marks>60 && subject3Marks>60 || subject2Marks>60 && subject3Marks>60) {
			return "Promoted";
		}
		else 
			return "fail";
	}
}
public class Assignment1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double subject1Marks = sc.nextDouble();
		double subject2Marks = sc.nextDouble();
		double subject3Marks = sc.nextDouble();
		ResultDeclaration obj =new ResultDeclaration();
		System.out.print(obj.declareResults(subject1Marks,subject2Marks,subject3Marks));
	}

}
