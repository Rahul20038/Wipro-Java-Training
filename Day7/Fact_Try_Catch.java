package Day7;
import java.util.Scanner;
public class Fact_Try_Catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Positive number : ");
			int num = sc.nextInt();
			if (num < 0) {
				throw new IllegalArgumentException("Number must be positive ");
			}
			long fact = 1;
			for (int i = 1; i <=num;i++) {
				fact *= i;
			}
			System.out.println("Factorial of "+num+" is "+fact);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Invalid Input...! please enter valid integer.");
		}
		finally {
			sc.close();
			System.out.println("Scanner is closed... Program ended");
		}
	}
}
