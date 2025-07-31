package Day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to count: ");
		String word = sc.nextLine();
		Map<Character, Integer> countchar = new HashMap<>();
		for(char c: word.toCharArray()) {
			countchar.put(c, countchar.getOrDefault(c, 0)+ 1);
		}
		System.out.println("Character count: ");
		for (Map.Entry<Character, Integer> entry: countchar.entrySet()) {
			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}
	}
}
