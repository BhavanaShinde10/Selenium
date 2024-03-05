package basicTestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AjioTest {

	
	/*
	 * @Test(priority=0) public void Facebook() { ChromeDriver driver= new
	 * ChromeDriver(); driver.get("https://www.facebook.com/"); //
	 * System.out.println("Facebook"); }
	 * 
	 * @Test(priority=1) public void Amazon() { ChromeDriver driver= new
	 * ChromeDriver(); driver.get("https://www.amazon.in/");
	 * //System.out.println("Amazon"); }
	 * 
	 * @Test(priority=0) public void Myntra() { ChromeDriver driver= new
	 * ChromeDriver(); driver.get("https://www.myntra.com/");
	 * //System.out.println("Amazon"); }
	 */
	@Test(invocationCount=2,priority=0)
	public void Facebook()
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
// System.out.println("Facebook");
}
	@Test(priority=1)
	public void Amazon()
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//System.out.println("Amazon");
	}
	@Test(priority=2)
	public void Myntra()
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		//System.out.println("Amazon");
	}

}
