package intermediate_assignment;
abstract class account{
	abstract int amount();
	int deposit() {
		return 1000;
	}
}
public class AssignmentQ4 extends account {
        int amount() {
        	return 3000;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account obj = new AssignmentQ4();
		System.out.println(obj.deposit());
		System.out.println(obj.amount());
	}

}
