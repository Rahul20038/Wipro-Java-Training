package src;
import java.util.Scanner;
public class Factorial {
	static int fact(int n) {
		return (n <= 1)? 1 : n*fact(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num  = sc.nextInt();
		System.out.println("Factorial: " + fact(num));
	}

}
