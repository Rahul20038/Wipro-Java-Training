package Day9;

import java.util.TreeSet;

public class Treeset_c {
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(8);
		numbers.add(69);
		numbers.add(2);
		numbers.add(5);
		System.out.println(numbers);
		System.out.println(numbers.first());
		System.out.println(numbers.last());
	}

}
