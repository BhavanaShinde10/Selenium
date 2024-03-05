package basicTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyntraAssert {

	    @Test
	    public void MyntraPage()
	    {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		/*
		 * String actualUrl=driver.getCurrentUrl(); String expectedUrl =
		 * "https://www.myntra.com/Pune";
		 */
		
		//Call assertEquals(boolean actual,boolean expected)
		/*
		 * Assert.assertEquals(actualUrl,expectedUrl);
		 * 
		 * 
		 * System.out.println(actualUrl);
		 */
		String actualtitle = driver.getTitle();
		String expectedtitle = "Onlines Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println(actualtitle);

		
		/*
		 * if (Url.equals("https://www.myntra.com/Pune")) {
		 * System.out.println("Url is matching"); } else {
		 * System.out.println("Url is not matching"); }
		 */
		//System.out.println(Url);
		//String title = driver.getTitle();
	    }
	

}
