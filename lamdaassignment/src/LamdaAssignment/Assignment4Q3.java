package LamdaAssignment;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
public class Assignment4Q3 {
	static void modifyValue(Consumer<product> c,product p1)
	{
		c.accept(p1);
		System.out.println("update value"+p1.getId());
	}
	static class product{
		private String name;
		private int id;
		public product(String name,int id) {
			super();
			this.name = name;
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	}
	static <E> void display(Supplier<E> s) {
		System.out.println(s.get());
	}
	static int returnIdByTen(int n, Function<Integer,Integer> fun)
	{
		int res = fun.apply(n);
		return res;
	}
	public static void main(String[] args)
	{
		product p = new product("product1", 111);
		display(()->p.getId());
		display(()->p.getName());
		
		Consumer<product> updateId = per->per.setId(222);
		updateId.accept(p);
		modifyValue(updateId,p);
		
		int n= p.getId();
		System.out.println(returnIdByTen(n,f->f+10));
		
		
		
		
	}
}
