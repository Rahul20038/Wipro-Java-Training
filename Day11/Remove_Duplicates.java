package Day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicates {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>(Arrays.asList("Rahul", "Sai", "Vinay","Ganesh","Rahul"));
		Set<String> unqset = new HashSet<>(lst);
		System.out.println(new ArrayList<>(unqset));
	
	}
}
