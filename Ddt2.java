package basicddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Ddt2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		/*Step1:Create object of FileInputStream class(from java pckg) & in FileInputStream constructor
		enter the path/location of external file*/
		
		FileInputStream fis= new FileInputStream("src\\test\\resources\\Ddt.xlsx");
		
		//Step2:Call WorkbookFactory class from apache poi & call create(InputSteam),Here we will get control of file
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step3:Call getSheet(String name) & enter sheet name & here we will get control of sheet
		Sheet sh = wb.getSheet("Sheet1");
		
		//Step4:Call getRow(int rownum) & Enter the row number  & we will get control of row
		Row rw = sh.getRow(0);
		
		//Step5:Call getCell(int cell)
		Cell cl = rw.getCell(0);
		
		//Step6:Call getStringCellValue()=>It will fetch data from the cell
		String data = cl.getStringCellValue();
		
		System.out.println(data);
		
		
		

	}

}
