package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_Comparable {
	public static void main(String[] args) {
		Comparator<Integer> s1 = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if(i > j)
					return 1;
				else
					return -1;
			}
		};
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(10);
		scores.add(7);
		scores.add(4);
		scores.add(56);
		scores.add(85);
		scores.add(76);
		scores.add(63);
		scores.add(55);
		System.out.println("scores : "+scores);
		Collections.sort(scores,s1);
		System.out.println("Scores after sorting: "+scores);
	}
}
