package Day5;
import java.util.*;
public class SortingNames {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Rahul");
		names.add("Sai");
		names.add("NTR");
		names.add("Zain");
		names.add("Abhi");
		
		System.out.println("Before Sorting Names: ");
		for (String name: names) {
			System.out.println(name);
		}
		Collections.sort(names);
		System.out.println("After Sorting Names: ");
		for (String name: names) {
			System.out.println(name);
		}
	}
}
