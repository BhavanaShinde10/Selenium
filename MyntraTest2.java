package basicTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyntraTest2 {
	@Test
	
	public void MyntraPage() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement searchtf = driver.findElement(By.className("desktop-searchBar"));
		//Assert.assertTrue(searchtf.isEnabled());
		//Assert.assertTrue(searchtf.isDisplayed());
		//Assert.assertTrue(searchtf.isSelected());
		
		
		System.out.println("Good Morning");
		//searchtf.isEnabled()=>True Condition=>Pass
				//searchtf.isDisplayed()=>True condition=>Pass
				//searchtf.isSelected()=>False condition=>Fail
		
		
		
	}

}
