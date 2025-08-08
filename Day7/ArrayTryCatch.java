package Day7;

public class ArrayTryCatch {
	public static void main(String[] args) {
		String[] names = {"Rahul", "Sai","Ganesh","Revanth","Vinay"};
		try {
			System.out.println("Accessing 6th Element: "+names[5]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception catch: "+e.getMessage());
			System.out.println("Your trying to access an index that doesn't exist");
		}
		finally {
			System.out.println("Final block...");
		}
		System.out.println("Program continues after exception handling.");
	}
}
