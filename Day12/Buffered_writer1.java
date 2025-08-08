package Day12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_writer1 {
	public static void main(String[] args) throws IOException {
		BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\lenovo\\OneDrive\\Documents\\Desktop\\file1.txt", true));
		{
			br.write("This is training writting content using bufferedwiter.");
			br.newLine();
			br.close();
			
		}
		System.out.println("File written successfully.");
	}
}
