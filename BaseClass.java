package commonUtils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	 WebDriver driver= new ChromeDriver();
	PropertyFileUtil putil= new PropertyFileUtil();
	WebDriverUtil wutil= new WebDriverUtil();
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("Connect to database");
	}
	
	@BeforeClass
	public void BC() throws IOException
	{
		//@BeforeClass is used to launch the application
		String URL = putil.getDataFromPropertyFile("Url");
		
		//WebDriver driver= new ChromeDriver();
		//To maximize the window
		wutil.maximize(driver);
		//To apply wait for findelement()
		wutil.implicitwait(driver);
		
		//To launch the application
				driver.get(URL);
	}
	@BeforeMethod
	public void BM() throws IOException
	{
		//WebDriver driver= new ChromeDriver();
		//@BeforeMethod is used to login to the application
		String USERNAME=putil.getDataFromPropertyFile("Username");
		String PASSWORD=putil.getDataFromPropertyFile("Password");
		//To login to application
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submit"
				+ "Button")).click();
	}
	@AfterMethod
	public void AM() throws InterruptedException
	{
		//WebDriver driver= new ChromeDriver();
		 //@AfterMethod is used to signout from application
		 //Mousehover on image
		 Thread.sleep(2000);
		 WebElement image = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		 wutil.mousehover(driver, image);
		 
		 //Click on signout
		 driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
	@AfterClass
	public void AC()
	{
		//@AfterClass is used to close the browser
		//WebDriver driver= new ChromeDriver();
		driver.quit();
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("Disconnect from database");
	}

}
