package basicTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {

	@Test
	public void MyntraPage()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.myntra.com/Pune";
		//Create object of SoftAssert class
		SoftAssert sa= new SoftAssert();
		//Call assertEqual(Boolean actual,boolean expected)
		sa.assertEquals(actualUrl, expectedUrl);
		System.out.println("Good Morning");
		//This method is mandatory
		sa.assertAll();
	}
}
