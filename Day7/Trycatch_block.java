package Day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Trycatch_block {
	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\lenovo\\OneDrive\\Documents\\Desktop\\samtry.txt");
		try {
			BufferedReader fr1 = new BufferedReader(new FileReader(f1));
			String line=fr1.readLine();
			while(line!=null) {
				System.out.println("File content: "+line);
				line=fr1.readLine();
			}
			fr1.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found error.");
		}
		catch(IOException e) {
			System.out.println("IO error occured while reading the file");
		}
		finally {
			System.out.println("this is the complete excution");
		}
	}

}
