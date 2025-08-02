package Day12;

import java.io.FileReader;
import java.io.IOException;

public class File_Reader1 {
	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("C:\\Users\\lenovo\\OneDrive\\Documents\\Desktop\\samtry1.txt");
		int ch;
		while((ch=fr1.read())!=-1) {
			System.out.println((char) ch);
		}
	}
}
