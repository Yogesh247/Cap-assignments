import java.util.*;
class SearchArray{
	public boolean searchArray(int[] arr,int toCheckValue) {
		boolean check = false;
		for(int element : arr) {
			
			if(element == toCheckValue) {
				check = true;
			    return check;
			}
			
		}
		return check;
	}
	
}
public class Assignment1Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int valueToCheck = 19; 
		SearchArray obj = new SearchArray();
	System.out.print(obj.searchArray(arr, valueToCheck));
		
	}

}
