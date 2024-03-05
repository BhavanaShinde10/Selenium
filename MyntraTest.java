package basicTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyntraTest {
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("AfterSuite");
	}
	
	@Test
	public void Amazon()
	{
		System.out.println("Amazon");
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("Before Method");
	}
	
	@Test
	
	public void Facebook()
	{
		System.out.println("Facebook");
	}
	
	@AfterMethod
	public void Am()
	{
		System.out.println("After Method");
	}
	@BeforeClass
	public void BC()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("After Class");
	}
	@BeforeTest
	public void BT()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("After Test");
	}

}
