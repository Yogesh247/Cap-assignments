package LamdaAssignment;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
public class LamdaQ7 {
public static String convertKeyValueToString(HashMap<String,Integer> map)
{
	 String str = "";
	 Set<Entry<String, Integer>> s = map.entrySet();
	 for(Entry<String,Integer> e:s)
	 {
		 str+=e.getKey()+ " ";
		 str+=e.getValue().toString()+" ";
	 }
	 return str;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		map.put("ykf", 1);
		map.put("abc", 2);
		map.put("def", 3);
		System.out.println(convertKeyValueToString(map));
	}

}
