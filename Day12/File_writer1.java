package Day12;

import java.io.FileWriter;
import java.io.IOException;

public class File_writer1 {
	public static void main(String[] args) throws IOException {
		String lines = "The java is Programming Language, Selenium ";
		FileWriter wrt = new FileWriter("C:\\Users\\lenovo\\OneDrive\\Documents\\Desktop\\file1.txt");
		wrt.write(lines);
		wrt.close();
		System.out.println("File written successfully.");
	
	}
}
