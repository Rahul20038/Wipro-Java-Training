package Day9;

import java.util.ArrayList;
import java.util.List;

public class List_p {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Rahul");
		names.add("Sai");
		names.add("Vinay");
		names.add("Ram");
		System.out.println(names.get(2));
		System.out.println(names.indexOf("Rahul"));
		for (String name:names) {
			System.out.println(name);
		}
		names.remove(3);
		System.out.println("After removing Ram "+names);
		
	}

}
