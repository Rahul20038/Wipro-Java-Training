package src;

public class VowelCount {
	public static void main(String[] args) {
		String str = "Rahul is a badboy";
		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
				count++;
			}
		}
		System.out.println("Number of Vowels: " + count);
	}
}
