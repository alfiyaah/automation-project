package pages;

import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Wanderlogz_pages {
WebDriver driver;
By start=By.xpath("//*[@id=\"react-main\"]/div[4]/div/div/div/div[3]/div[1]/a/div/div/span");
By logo=By.xpath("//*[@id=\"react-main\"]/nav/div/div/div/div/a/div/div/img");
By signup=By.xpath("//*[@id=\"react-main\"]/nav/div/div/div/ul/div/div/li[3]/button/div/div/span");
By email=By.xpath("/html/body/div[7]/div/div[1]/div/div/div/div[2]/div[2]/div/form/div[3]/div[1]/input");
By password=By.xpath("/html/body/div[5]/div/div[1]/div/div/div/div[2]/div[2]/div/form/div[4]/div[1]/input");
By signclick=By.xpath("/html/body/div[6]/div/div[1]/div/div/div/div[2]/div[2]/div/form/button/div/div/span");
By close=By.xpath("/html/body/div[5]/div/div[1]/div/div/div[1]/div[2]/div[2]/button/div[1]/svg");
By fullname=By.xpath("/html/body/div[4]/div/div[1]/div/div/div/div/form/div[2]/input");
By finish=By.xpath("/html/body/div[4]/div/div[1]/div/div/div/div/form/button/div/div/span");
By account=By.xpath("//*[@id=\"react-main\"]/nav/div/ul/div/div[3]/div[1]/div/button/span/div");
By signout=By.xpath("//*[@id=\"react-main\"]/nav/div/ul/div/div[3]/div[2]/button");
By login=By.xpath("//*[@id=\"react-main\"]/nav/div/div/div/ul/div/div/li[2]/a");
By loginid=By.xpath("/html/body/div[7]/div/div[1]/div/div/div/div[2]/div[2]/div/form/div[3]/div/input");
By loginpass=By.xpath("/html/body/div[7]/div/div[1]/div/div/div/div[2]/div[2]/div/form/div[4]/div/input");
By logclick=By.xpath("/html/body/div[7]/div/div[1]/div/div/div/div[2]/div[2]/div/form/button/div/div/span");
By newtrip=By.xpath("//*[@id=\"react-main\"]/div[2]/div[1]/div[2]/div[1]/a/div[2]/div/span");
By home=By.xpath("//*[@id=\"react-main\"]/nav/div/div/div/ul/li[1]/a");
By explore=By.xpath("//*[@id=\"NavbarGeoAutoSuggest\"]");
By going=By.xpath("//*[@id=\"TripOrGuideForm__autosuggest\"]");
By japan=By.xpath("//*[@id=\"react-autowhatever-1--item-0\"]/div");
By select=By.xpath("//*[@id=\"react-main\"]/div[2]/div/div/div/div[2]/form/div[3]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div/strong");
By stdate=By.xpath("//*[@id=\"react-main\"]/div[2]/div/div/div/div[2]/form/div[2]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div/strong");
By enddate=By.xpath("//*[@id=\"react-main\"]/div[2]/div/div/div/div[2]/form/div[2]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div/strong");
By date=By.xpath("//*[@id=\"react-main\"]/div[2]/div/div/div/div[2]/form/div[2]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[4]");
By planning=By.xpath("//*[@id=\"react-main\"]/div[2]/div/div/div/div[2]/form/button[1]/div/div/span");
By later=By.xpath("//*[@id=\"react-main\"]/div[2]/div/div/div/div[4]/button/div/div/span");
By topplaces=By.xpath("//*[@id=\"PlanPageLoaded__Explore\"]/div/div/div/div/div/div/div/div[4]/div/div[1]/div/div/div[1]/span/span/div/img");
By logout=By.xpath("//*[@id=\"react-main\"]/nav/div/ul/div/div[3]/div[1]/div/button/span/svg/path");

//-----------Constructor--------------
public Wanderlogz_pages(WebDriver driver)
{
	this.driver=driver;

}

//-------------SignUp----------------
public void signup() throws Exception
{
	Thread.sleep(5000);
 driver.findElement(signup).click();
 driver.findElement(email).sendKeys("oxfordoxford021@gmail.com");
	 Thread.sleep(5000);
 driver.findElement(password).sendKeys("oxfordlucky");
 driver.findElement(signclick).click();
 driver.findElement(close).click();
	    Thread.sleep(10000);
 driver.findElement(fullname).sendKeys("lucky");
 driver.findElement(finish).click();
	   Thread.sleep(5000);
 driver.findElement(account).click();
 driver.findElement(signout).click();
}	 

//----------Logo Verification---------
public void logo()
{
 WebElement logos=driver.findElement(logo);
  if(logos.isDisplayed())
  {
   System.out.println("Logo is displayed");
  }
   else
  {
   System.out.println("Logo is not displayed");
  }
}

//-----------Title Verification----------
public void Titleverification()
{
 String Actualtitle=driver.getTitle();
 String expectedtitle="Home";
  if(Actualtitle.equals(expectedtitle))
  {
	System.out.println("Title is verfied");
  }
	 else
  {
	System.out.println("Title is not verified");
   }
}

//-------------Link Verification------------
public void linkverification() throws Exception 
{
 String baseurl="https://www.Wanderlog.com";
 driver.get(baseurl);
 URL ob1=new URL(baseurl);
 HttpURLConnection con=(HttpURLConnection)ob1.openConnection();
  con.connect();
 if(con.getResponseCode()==200)
	{
	System.out.println("Valid link---"+baseurl);
	}
	else
	{
	System.out.println("Invalid link---"+baseurl);
		}
 }

//---------------Screenshot--------------
public void screenshot() throws Exception 
{
	File srnst=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(srnst,new File ("C:\\Users\\User\\Desktop\\scrnshot//wanderlog.png"));

	WebElement planning=driver.findElement(start);
	File srn=planning.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(srn,new File("./screenshot//element.png"));
}

//---------------Login------------------
public void login() throws Exception
{
	  Thread.sleep(5000);
 driver.findElement(login).click();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

 File f=new File("C:\\Users\\User\\Desktop\\wgproject.xlsx");
 FileInputStream fi=new FileInputStream(f);
 XSSFWorkbook wb=new XSSFWorkbook(fi);
 XSSFSheet sh=wb.getSheet("Sheet1");
 System.out.println(sh.getLastRowNum());

 for(int i=1;i<=sh.getLastRowNum();i++)
  {
	 String usnme=sh.getRow(i).getCell(0).getStringCellValue();
	 System.out.println("username="+usnme);
	 String pswrd=sh.getRow(i).getCell(1).getStringCellValue();
	 System.out.println(pswrd);
	 
	 driver.findElement(loginid).clear();
	 driver.findElement(loginid).sendKeys(usnme);
	 driver.findElement(loginpass).clear();
	 driver.findElement(loginpass).sendKeys(pswrd);
	 
	 driver.findElement(logclick).click();
	}
}

//-------------Window Handling-----------------
public void windowhandling()
{
	String parentwindow=driver.getWindowHandle();
	System.out.print("parentwindow : " +driver.getTitle());
	driver.findElement(newtrip).click();
		
	     // Set<String> allWindowHandle=driver.getWindowHandles();
		
	Set<String> allwindowhandles=driver.getWindowHandles();
	for(String handle:allwindowhandles)
	{
		System.out.println(handle);
		
	if(!handle.equalsIgnoreCase(parentwindow))
	{
		 driver.switchTo().window(handle);
		 driver.findElement(explore).sendKeys("munnar",Keys.ENTER);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 driver.close();
	 }

	     driver.switchTo().window(parentwindow);
	   
	}
	}

//---------------Booking---------------
public void booking()
{
  driver.findElement(newtrip).click();
  driver.findElement(going).sendKeys("japan");
  driver.findElement(japan).click();
  driver.findElement(select).click();
  driver.findElement(stdate).click();

  while(true)
  {
   WebElement month=driver.findElement(stdate);
   String month1=month.getText();
   System.out.println(month1);
	     
  if(month1.equals("April 2024"))
  {
   System.out.println(month1);
	  break;
  }
   else
  {
	driver.findElement(enddate);
	  break;
  }
	    	   
  }
	  
  List<WebElement>thedate=driver.findElements(date);
   System.out.println(thedate);
   for(WebElement dateelement:thedate) 
  {
   String dates=dateelement.getText();
	System.out.println(dates);
	 if(dates.equals("17"))
  {
	System.out.println(dates);
	 dateelement.click();
	  System.out.println("selected dates");
	    break;
	}
  }
	    
    driver.findElement(planning).click();
    driver.findElement(later).click();
	driver.findElement(topplaces).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,5000)","");
	 driver.navigate().back();
	 driver.navigate().back();
	 driver.findElement(login).click();
	 driver.findElement(logout).click();
	 driver.close();
	 driver.quit();
  }
}


