package intermediate_assignment;
abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "FilePersistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "DatabasePersistence";
    }
}
public class Assignment2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence obj1 = new FilePersistence();
		Persistence obj2 = new DatabasePersistence();
		System.out.println(obj1.persist());
		System.out.println(obj2.persist());

	}

}
