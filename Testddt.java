package basicddt;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import commonUtils.ExcelUtil;
import commonUtils.PropertyFileUtil;

public class Testddt {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		ExcelUtil eutil= new ExcelUtil();
        PropertyFileUtil putil= new PropertyFileUtil();
        System.out.println(putil.getDataFromPropertyFile("Url"));
		System.out.println(eutil.getDataFromExcel("Sheet1",0,0));
		System.out.println(eutil.getDataFromExcel("Sheet1",0,1));

	}

}
