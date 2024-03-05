package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbDdt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		
		/*Step1:Create object of FileInputStream class(from java pckg) & in FileInputStream constructor
		enter the path/location of external file*/
		FileInputStream fis= new FileInputStream("src\\test\\resources\\Fb.properties");
		
		//Step2:Create of object of Properties class
		Properties p= new Properties ();
		
		//Step3:Call Load(inputstream) to fetch the location of the external file 
		p.load(fis);
		
		//Step4:Call getProperty(String key) to fetch the keys(case sensitive) in external file
		String URL=p.getProperty("Url");
		String EMAIL = p.getProperty("Email");
		String PASSWORD = p.getProperty("Password");
		//driver.get(URL);
		
		
		driver.findElement(By.id("email")).sendKeys(EMAIL);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);

	}

}
