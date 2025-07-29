package Day9;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_c {
	public static void main(String[] args) {
		Set<Integer> nums=new HashSet<Integer>(); 
		nums.add(55);
		nums.add(30);
		nums.add(77);
		nums.add(30);
		nums.add(1);
		nums.add(1);
		System.out.println(nums);
		for (int num:nums) {
			System.out.println(num);
		}
		Iterator<Integer> iterator =nums.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
