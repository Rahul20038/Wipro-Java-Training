package TestingDay26;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider { 

   @DataProvider()
   public String[][] getdata() throws IOException {
       
       File s = new File("C:\\Users\\lenovo\\OneDrive\\Documents\\Desktop\\WiproTraining\\Wipro-Testing-Documents\\Book1.xlsx");
       System.out.println("Excel file exists: " + s.exists());  // check if file is found
       
       FileInputStream fis = new FileInputStream(s);
       XSSFWorkbook workbook = new XSSFWorkbook(fis);
       XSSFSheet sheet = workbook.getSheetAt(0);  // First sheet

       int noOfRows = sheet.getPhysicalNumberOfRows();
       int noOfCols = sheet.getRow(0).getLastCellNum();

       System.out.println("Total Rows (including header): " + noOfRows);
       System.out.println("Total Columns: " + noOfCols);

       String[][] data = new String[noOfRows-1][noOfCols]; // exclude header row

       DataFormatter df = new DataFormatter();

       for(int i=0;i<noOfRows-1;i++) {
           for(int j=0;j<noOfCols;j++) {
               data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
           }
           // Print each row for confirmation
           System.out.println("Row " + (i+1) + ": " + String.join(" | ", data[i]));
       }

       workbook.close();
       fis.close();

       return data;
   }
}
