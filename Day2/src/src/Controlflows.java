package src;

public class Controlflows {
	public static void main(String[] args) {
		int age = 18;
		if (age >= 18) {
			System.out.println("Adult");
		} else {
			System.out.println("Minor");
		}
		
		switch(age) {
			case 1:
				System.out.println("age is greater than 18 so he can drive");
				break;
			case 2:
				System.out.println("age is greater than 18 so he can ride");
				
		}
	}

}
