package practice.book;

import java.awt.RenderingHints.Key;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class bookpageTest{
	
	WebDriver driver;
	bookpage bo;
	
  @BeforeTest
  public void launch() throws IOException {
	  System.setProperty("webdriver.chrome.driver","D:\\eclipse-folder\\chromedriver_win32_91\\chromedriver.exe");
	     driver=new ChromeDriver();
		this.driver=driver;
		driver.get("https://bloomsbury-test-store2.skyron-staging.co.uk/uk/");
		driver.manage().window().maximize();
     driver.findElement(By.cssSelector("button.onetrust-close-btn-handler.onetrust-close-btn-ui.banner-close-button.ot-close-icon")).click();
		driver.findElement(By.id("ip-redirect-cancel")).click();		
  }
  
 @AfterTest
 public void serach() {
	 RemoteWebDriver r= (RemoteWebDriver) driver;
	String c="document.getElementById('autoCompleteSearch').value='admin'";
	r.executeScript(c);
 }
  /*@AfterTest
  public void tearDown() {
	  driver.close();
  }	
	@Test(priority=1)
	//@Test(enabled=false)
	public void academics() throws IOException {
		bo = new bookpage(driver);
		bo.books().click();
		bo.acads().click();
		bo.acaLinks().click();
	WebElement acaLink=	driver.findElement(By.xpath("//div[@id='subLevelsParent']/div[1]"));
	List<WebElement> links=acaLink.findElements(By.tagName("a"));
	for(WebElement link:links) {
		String url=link.getAttribute("href");
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		conn.connect();
		int respcode=conn.getResponseCode();
		//System.out.println(link.getText()+respcode);
		if(respcode>400) {
			System.out.println("broken link"+link.getText()+respcode);
			Assert.assertTrue(false);			
		}	}
	}
//	@Test(enabled=false)
	@Test(priority=2)
		public void childrens() throws IOException {
			bo = new bookpage(driver);
			bo.books().click();
			bo.child().click();
			WebElement acaLink=driver.findElement(By.xpath("//div[@id='subLevelsParent']/div[2]"));
			List<WebElement> links=acaLink.findElements(By.tagName("a"));
			for(WebElement link:links) {
				String url=link.getAttribute("href");
				HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
				conn.connect();
				int respcode=conn.getResponseCode();
				System.out.println(link.getText()+respcode);
				if(respcode>400) {
					System.out.println("broken link"+link.getText()+respcode);
					Assert.assertTrue(false);	
					}			}			}
//	@Test(enabled=false)
	@Test(priority=3)
		public void Education() throws IOException {
		bo.books().click();
		bo.eduL().click();
		WebElement acaLink=driver.findElement(By.xpath("//div[@id='subLevelsParent']/div[3]"));
		List<WebElement> links=acaLink.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.connect();
			int respcode=conn.getResponseCode();
			System.out.println(link.getText()+respcode);
			if(respcode>400) {
				System.out.println("broken link"+link.getText()+respcode);
				Assert.assertTrue(false);
			}
		}	}
		
		@Test(priority=4)
//	@Test(enabled=false)
		public void Fiction() throws IOException {
			bo = new bookpage(driver);
			bo.books().click();
			bo.ficL().click();
		WebElement acaLink=driver.findElement(By.xpath("//div[@id='subLevelsParent']/div[4]"));
		List<WebElement> links=acaLink.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.connect();
			int respcode=conn.getResponseCode();
			System.out.println(link.getText()+respcode);
			if(respcode>400) {
				System.out.println("broken link"+link.getText()+respcode);
				Assert.assertTrue(false);
			}
		}	}
	//@Test(enabled=false)
		@Test(priority=5)
		public void harrypotter() throws IOException {
			bo = new bookpage(driver);
		bo.books().click();
		bo.harrpL().click();
		WebElement acaLink=driver.findElement(By.xpath("//div[@id='subLevelsParent']/div[5]"));
		List<WebElement> links=acaLink.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.connect();
			int respcode=conn.getResponseCode();
			System.out.println(link.getText()+respcode);
			if(respcode>400) {
				System.out.println("broken link"+link.getText()+respcode);
				Assert.assertTrue(false);
			}
		}	}
	//	@Test(enabled=false)
		@Test(priority=6)
		public void nonfiction() throws IOException {
		bo.books().click();
		
		bo.nonficL().click();
		WebElement acaLink=driver.findElement(By.xpath("//div[@id='subLevelsParent']/div[6]"));
		List<WebElement> links=acaLink.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.connect();
			int respcode=conn.getResponseCode();
			System.out.println(link.getText()+respcode);
			if(respcode>400) {
				System.out.println("broken link"+link.getText()+respcode);
				Assert.assertTrue(false);
			}
		}	}*/
		
}