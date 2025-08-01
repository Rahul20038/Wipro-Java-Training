package Day11;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("C:\\Users\\lenovo\\OneDrive\\Documents\\Desktop\\samtry1.txt");
			writer.write("HI I am Learning Java.");
			writer.write("With the testing tool Selenium");
			writer.close();
			System.out.println("File was wwritten Successfully.");	
		}catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}	
	}
}
