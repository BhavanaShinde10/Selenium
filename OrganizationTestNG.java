package vtigerCrm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonUtils.BaseClass;
import commonUtils.ExcelUtil;
import commonUtils.JavaUtil;
import commonUtils.PropertyFileUtil;
import commonUtils.WebDriverUtil;

public class OrganizationTestNG extends BaseClass {
	 WebDriver driver;
	
	PropertyFileUtil putil= new PropertyFileUtil();
	WebDriverUtil wutil= new WebDriverUtil();
	ExcelUtil eutil= new ExcelUtil();
	JavaUtil jutil= new JavaUtil();
	
	
	@Test
	public void OrganisationTest() throws IOException, InterruptedException
	{
		//WebDriver driver= new ChromeDriver();
		//To maximize the window
		//wutil.maximize(driver);
		//To apply wait for findelement()
		//wutil.implicitwait(driver);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//To read the data from property file
		/*
		 * String URL = putil.getDataFromPropertyFile("Url"); String
		 * USERNAME=putil.getDataFromPropertyFile("Username"); String
		 * PASSWORD=putil.getDataFromPropertyFile("Password");
		 */
		//To read data from excel file
		String ORGNAME = eutil.getDataFromExcel("Organizations", 0, 1);
		String GROUP = eutil.getDataFromExcel("Organizations", 1, 1);
		//To launch the application
		//driver.get(URL);
		/*
		 * //To login to application
		 * driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		 * driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		 * driver.findElement(By.id("submitButton")).click();
		 */
		//Click on organisation
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click() ;
		//Click on create organisation..(+)
		driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click() ;
		//Enter Organization name
		driver.findElement(By.name("accountname")).sendKeys(ORGNAME+jutil.getRandomNumber()) ;
		//In assignTo click on group
		driver.findElement(By.cssSelector("input[value='T']")).click() ;
		
		//driver.findElement(By.id("assign_team")).click() ;
		 WebElement dropdown = driver.findElement(By.name("assigned_group_id"));
		 wutil.handleDropdown(dropdown, GROUP);
		 
		 //To click on save button
		 driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		 
		
		
		 //Mousehover on image
			/*
			 * WebElement image =
			 * driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")
			 * ); wutil.mousehover(driver, image);
			 */
		 //Click on signout
		// driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		 //Note:We can run this program only once ,to overcome this problem randomnumbers
			/*
			 * Select s= new Select(dropdown); s.selectByVisibleText(GROUP);
			 */
	}

}
