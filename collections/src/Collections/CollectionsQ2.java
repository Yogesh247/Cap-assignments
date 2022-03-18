package Collections;
import java.util.*;
public class CollectionsQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<>(10);
		h.add(52);
		h.add(80);
		h.add(74);
		h.add(61);
		h.add(12);
		h.add(98);
		h.add(54);
		h.add(69);
		h.add(97);
		h.add(35);
		Iterator<Integer> i = h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
