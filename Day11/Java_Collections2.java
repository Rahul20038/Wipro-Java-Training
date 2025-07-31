package Day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Java_Collections2 {
	public static void main(String[] args) {
	ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(9,5,7,100,74,6,95,1,524,777));
	alist.add(44);
	alist.add(55);
	alist.add(77);
	System.out.println(alist);
	Collections.sort(alist);
	System.out.println("Sorted : "+alist);
	Collections.reverse(alist);
	System.out.println("Sorted Reverse Order: "+alist);
	}	
}
