package Day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_Catchcsv {
	public static void main(String[] args) {
		File f2 = new File("C:\\Users\\lenovo\\Downloads\\product_data.csv");
		try {
			BufferedReader fr2 = new BufferedReader(new FileReader(f2));
			String line=fr2.readLine();
			while(line!=null) {
				System.out.println("File content: "+line);
				line=fr2.readLine();
			}
			fr2.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File not found Error.");	
		}catch(IOException e) {
			System.out.println("IO error occured while reading the file.");
		}
		finally {
			System.out.println("this the complete file.");
		}
	}
}
