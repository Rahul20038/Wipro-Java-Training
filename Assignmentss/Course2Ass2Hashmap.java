package Assignmentss;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Course2Ass2Hashmap {
	public static void main(String[] args) {
		Map<String, Integer> studentscores = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Choose an Option: ");
			System.out.println("1. Add Student ");
			System.out.println("2. Get Student Score ");
			System.out.println("3. Exit ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter the student Name: ");
				String name = scanner.nextLine();
				System.out.println("Enter the student's Score: ");
				int score = scanner.nextInt();
				studentscores.put(name, score);
				break;
			case 2:
				System.out.println("Enter the student Name to get the score: ");
				String studentName = scanner.nextLine();
				Integer studentScore = studentscores.get(studentName);
				if (studentScore != null) {
					System.out.println("Score for "+studentName+" is "+studentScore);
				} else {
					System.out.println("Student data not Found!!!!! ");
				}
				break;
			case 3:
				System.out.println("Exiting.....!!!!! ");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choise. please try again. ");
			}
		}
	}
}
