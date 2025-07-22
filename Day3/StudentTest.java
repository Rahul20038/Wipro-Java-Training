package Day3;
class Student{
	String name;
	int age;
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Rahul_N";
		s1.age = 22;
		s1.display();
		Student s2 = new Student();
		s2.name = "Ganesh_N";
		s2.age = 22;
		s2.display();
	}

}
