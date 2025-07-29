package Day9;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_C {
	public static void main(String[] args) {
		Map<String, Integer> students = new HashMap<>();
		students.put("Rahul", 01);
		students.put("Sai", 02);
		students.put("vinay", 03);
		students.put("Ganesh", 04);
		students.put("Saii", 05);
		System.out.println(students);
		for(Map.Entry<String, Integer> entry : students.entrySet()) {
			System.out.println("Name: "+ entry.getKey()+","+ " Roll No: "+ entry.getValue());
		}
	}

}
