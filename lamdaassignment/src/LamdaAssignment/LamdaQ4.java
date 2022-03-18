package LamdaAssignment;
import java.util.*;
public class LamdaQ4 {
	public static ArrayList<String> removeOddLength(ArrayList<String>employeeList)
	{
		employeeList.removeIf(n->n.length()%2 != 0);
		return employeeList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		arr.add("ab");
		arr.add("abc");
		arr.add("abcd");
		arr.add("abcde");
		arr.add("abcdef");
		arr.add("abcdefg");
		ArrayList<String> arr1 = removeOddLength(arr);
		for(String str:arr1)
			System.out.println(str);


		
	}

}
