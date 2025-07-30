package Day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Stud implements Serializable{
	private String name;
	private int age;
	public Stud(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Stud() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		}
	public String toString() {
		return "Student{name='" + name + "', age=" + age + "}";
	}
	}
	
public class Serializationprgm {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Stud s1 = new Stud();
		s1.setName("Rahul");
		s1.setAge(22);
		FileOutputStream fout = new FileOutputStream("C:\\Users\\lenovo\\OneDrive\\Documents\\Desktop\samtry.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.close();
		fout.close();
		System.out.println("Object has been serialized");
		
		FileInputStream fin =new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Documents\\Desktop\samtry.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		Stud s2 = (Stud) in.readObject();
		in.close();
		fin.close();
		System.out.println("Deserialized Student: ");
		System.out.println(s2);
	}
}
