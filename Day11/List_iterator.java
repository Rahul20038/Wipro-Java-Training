package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class List_iterator {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>(List.of("R","A","H","U","L"));
		ListIterator<String> itl = lst.listIterator();
		System.out.println("Forward: ");
		while (itl.hasNext()) {
			System.out.println(itl.next());
		}
		System.out.println("Backward: ");
		while(itl.hasPrevious()) {
			System.out.println(itl.previous());
		}
	}
}
