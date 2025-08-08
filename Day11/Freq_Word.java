package Day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Freq_Word {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line to count the words: ");
		String input = sc.nextLine();
		String[] words = input.split(" ");
		Map<String, Integer> freq = new HashMap<>(); 
		for(String word: words) {
			freq.put(word, freq.getOrDefault(word, 0)+1);
		}
		System.out.println(freq);
		
	}
}
