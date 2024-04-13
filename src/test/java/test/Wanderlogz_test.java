package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Wanderlogz_pages;

public class Wanderlogz_test {
	WebDriver driver;
	
@BeforeTest
public void setup()
	{
	 driver=new ChromeDriver();
	}

	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.wanderlog.com");
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws Exception 
	{
		Wanderlogz_pages ob=new Wanderlogz_pages(driver);
		ob.signup();
		ob.logo();
		ob.Titleverification();
		ob.linkverification();
		ob.screenshot();
		ob.login();
		ob.windowhandling();
		ob.booking();
	}
}

