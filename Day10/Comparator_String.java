package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	int age;
	String name;
	Student(int age, String name){
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return "Student[age=" +age+ ", name=" +name+ "]";
	}
}
public class Comparator_String {
	public static void main(String[] args) {
		Comparator<Student> c1 =new Comparator<Student>() {
			public int compare(Student i, Student j) {
				if(i.age > j.age)
					return 1;
				else
					return -1;
			}
		};
		List<Student> stud = new ArrayList<Student>();
		stud.add(new Student(22,"Rahul"));
		stud.add(new Student(26,"Nag"));
		stud.add(new Student(21,"Sai"));
		stud.add(new Student(29,"Chintu"));
		Collections.sort(stud,c1);
		System.out.println(stud);
		for(Student s:stud) {
			System.out.println(s);
		}
		
	}
}
