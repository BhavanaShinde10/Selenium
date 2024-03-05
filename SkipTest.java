package basicTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SkipTest {
	
	@Test
	public void Zomato()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.zomato.com/Pune");
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.zomato.com";
		//Create object of SoftAssert class
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(actualUrl, expectedUrl);
		System.out.println("Good Morning");
		//This method is mandatory
		sa.assertAll();
	}
	@Test(dependsOnMethods="Zomato")
	public void Facebook()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test(dependsOnMethods="Zomato")
	public void Swiggy()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.swiggy.com/");
	}
	

}
