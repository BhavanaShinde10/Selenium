package vtigerCrm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonUtils.ExcelUtil;
import commonUtils.JavaUtil;
import commonUtils.PropertyFileUtil;
import commonUtils.WebDriverUtil;

public class Leads {
	
	PropertyFileUtil putil= new PropertyFileUtil();
	WebDriverUtil wutil= new WebDriverUtil();
	ExcelUtil eutil= new ExcelUtil();
	JavaUtil jutil= new JavaUtil();
	
	@Test
	public void LeadTest() throws IOException
	{
		WebDriver driver= new ChromeDriver();
		//To maximize the browser window
		wutil.maximize(driver);
		//To apply wait for findelement()
		wutil.implicitwait(driver);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//To read the data from property file
		String URL = putil.getDataFromPropertyFile("Url");
		String USERNAME=putil.getDataFromPropertyFile("Username");
		String PASSWORD=putil.getDataFromPropertyFile("Password");
	    String FIRSTNAME = eutil.getDataFromExcel("Contacts", 0, 1); 
		String LASTNAME =eutil.getDataFromExcel("Contacts", 1, 1);
		
		
		//tO LAUNCH APPLICATION
		driver.get(URL);
		//To login to application
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		//To click on Leads
		driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
		//Click on select(+) in Leads name teztfield
		driver.findElement(By.cssSelector("img[alt='Create Lead...']")).click();
		//Enter first name
		driver.findElement(By.cssSelector("input[name='firstname']")).
	}

}
