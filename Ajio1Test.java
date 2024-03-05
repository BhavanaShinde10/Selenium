package basicTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ajio1Test {
	
	@Test
	public void Myntra()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement searchtf = driver.findElement(By.className("desktop-searchBar"));
		
		//Call assertFalse(boolean condition)
		//Assert.assertFalse(searchtf.isEnabled());
		//Assert.assertFalse(searchtf.isDisplayed());
		Assert.assertFalse(searchtf.isSelected());
		System.out.println("Good morning");
		
		//searchtf.isEnabled()=>True Condition=>Fail
		//searchtf.isDisplayed()=>True condition=>Fail
		//searchtf.isSelected()=>False condition=>Pass
	}

}
