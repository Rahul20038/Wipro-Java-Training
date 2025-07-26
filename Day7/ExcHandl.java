package Day7;

public class ExcHandl {
	public static void main(String[] args) {
		try {
			int a = 20;
			int b = 5;
			int res = a/b;
			System.out.print("Result: "+ res);
		}
		catch(Exception e) {
			System.out.println("Division gone wrong || "+ e.getMessage());
			throw e;
		}
		finally {
			System.out.println(" Calculation Peration is completed");
		}
	}

}
