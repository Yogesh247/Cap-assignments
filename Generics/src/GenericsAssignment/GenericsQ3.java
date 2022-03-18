package GenericsAssignment;

 class swap<T> {
	private T a[];

	public swap(T a[]) {
		super();
		this.a = a;
	}
	
	public void swapping(int b,int c) {
		T temp;
		temp = this.a[b];
		a[b] = a[c];
		a[c] = temp;
	}

	public T[] getA() {
		return a;
	}
	
	public int size(T l[]) {
		return l.length;
	}
}

public class GenericsQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr = {10,20,30,40,50,60,70};
		swap<Integer> n = new swap<Integer>(arr);
		n.swapping(2, 3);
		Integer m[] = n.getA();
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i]+" ");
		}
	}



	}


