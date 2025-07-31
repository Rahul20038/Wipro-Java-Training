package Day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Adding_courses {
	public static void main(String[] args) {
		ArrayList<String>  courses = new ArrayList<>();
		courses.add("Python");
		courses.add("AWS");
		courses.add("Azure");
		courses.add("C++");
		courses.add("AWS");
		courses.add("Python");
		courses.add("GCP");
		for(String c:courses) {
			System.out.println(c);
		}
		Set<Integer> Courses = new HashSet<>(); 
		Courses.add(101);
		Courses.add(102);
		Courses.add(103);
		Courses.add(104);
		Courses.add(102);
		Courses.add(101);
		Courses.add(105);
		for (int i:Courses) {
			System.out.println(i);
		}
		Map<String, Integer> courselist = new HashMap<>();
		courselist.put("Python", 101);
		courselist.put("AWS", 102);
		courselist.put("Azure", 103);
		courselist.put("C++", 104);
		courselist.put("AWS", 102);
		courselist.put("Python", 101);
		courselist.put("GCP", 105);
		for(String cl:courselist.keySet()) {
			System.out.println(cl + " = "+courselist.get(cl));
		}
		
	}
}
