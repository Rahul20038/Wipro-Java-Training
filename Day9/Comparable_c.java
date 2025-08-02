package Day9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Comparable_c implements Comparable <Comparable_c>{
	private String name;
	private int age;
	public Comparable_c(String n, int a) {
		this.name =n;
		this.age = a;
	}
	public int compareTo(Comparable_c other) {
		return this.age-other.age;
	}
	public String toString() {
		return name;
	}
	public static void main(String[] args) {
		List<Comparable_c> a = Arrays.asList(new Comparable_c("Rahul",22), new Comparable_c("Sai",21));
		Collections.sort(a);
		System.out.println(a);
	}
}
