package vtigerCrm;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commonUtils.ExcelUtil;
import commonUtils.JavaUtil;
import commonUtils.ListenerImplementation;
import commonUtils.PropertyFileUtil;
import commonUtils.WebDriverUtil;
@Listeners(ListenerImplementation.class)
public class Contacts {
	
	PropertyFileUtil putil= new PropertyFileUtil();
	WebDriverUtil wutil= new WebDriverUtil();
	ExcelUtil eutil= new ExcelUtil();
	JavaUtil jutil= new JavaUtil();
	
	@Test
	public void contactTest() throws IOException, InterruptedException
	{
		//To launch empty browser
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
		
		//To read data from excel file
		  String FIRSTNAME = eutil.getDataFromExcel("Contacts", 0, 1); 
		  String LASTNAME =eutil.getDataFromExcel("Contacts", 1, 1);
		  String ASSIGN =eutil.getDataFromExcel("Contacts", 2, 1);
		  String ORGNAME = eutil.getDataFromExcel("Contacts", 3, 1);
		 
		
		//tO LAUNCH APPLICATION
		driver.get(URL);
		//To login to application
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		//click on contacTs
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//Click on create contacts..(+)
		driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();
		//Enter first name
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(FIRSTNAME+jutil.getRandomNumber());
		//Enter last name
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(LASTNAME);
		
		//To fail the testscrpt
		/*
		 * WebElement notifycheckbox = driver.findElement(By.name("notify_owner"));
		 * Assert.assertTrue();
		 */
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "http://localhost:8888/pune/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing";
		Assert.assertEquals(actualurl, expectedurl);
		
		////In assignTo click on group radio btn
		driver.findElement(By.cssSelector("input[value='T']")).click() ;
		//Click on assignedTo dropdown
		WebElement dropdown = driver.findElement(By.name("assigned_group_id"));
		 wutil.handleDropdown(dropdown, ASSIGN);
		 
		 //Click on select(+) i n organisation name teztfield
		 driver.findElement(By.xpath("(//img[@alt='Select'])[1]")).click();
		 
		 //tRANSFER THE DRIVER CONTROL from parent window to child window
		 wutil.switchWindow(driver, "http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=");
		/*Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		 
		for (String e : ids) {
			String actualurl=driver.switchTo().window(e).getCurrentUrl();
			System.out.println(actualurl);
			
			String childurl="http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=";
			if (actualurl.contains("")) {
				
			}
		}*/
		 //To enter organisation name i n searchtf
		driver.findElement(By.id("search_txt")).sendKeys(ORGNAME);
		//To click on search now button
		driver.findElement(By.name("search")).click();
		
		//Click on organisation name
		driver.findElement(By.xpath("//a[text()='Qspiders']")).click();		
		
		//To transfer control from child winow to parent window
		wutil.switchWindow(driver, "http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing");
		
		//Click on save button
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		Thread.sleep(2000);
		 //To take Screenshot of contact
		// wutil.screenshot(driver,"Contacts");
		
		 Thread.sleep(2000);
		 //Mousehover on image
		 WebElement image = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		 wutil.mousehover(driver, image);
		 
		 //Click on signout
		 driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
