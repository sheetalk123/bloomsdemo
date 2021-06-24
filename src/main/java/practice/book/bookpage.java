package practice.book;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookpage {
	WebDriver driver;
	
	By book= By.xpath("//ul[@id='desktopMainNavigation']/li[1]/a[1]");
	By acad=By.xpath("//div[@id='subSubLevels']/a[1]");
	By acaLink=By.xpath("//div[@id='subLevelsParent']/div[1]");
	By childl=By.xpath("//div[@id='subSubLevels']/a[2]");
	By chLink=By.xpath("//div[@id='subLevelsParent']/div[2]");
	By edu=By.xpath("//div[@id='subSubLevels']/a[1]");
	By fic= By.xpath("//div[@id='subSubLevels']/a[4]");
	By harryp= By.id("subSubLevelLink-1384");
	 By nonf= By.xpath("//div[@id='subSubLevels']/a[6]");
	
	public bookpage(WebDriver driver) {
			this.driver=driver;
		// TODO Auto-generated constructor stub
	}	
	public WebElement books() {
		return driver.findElement(book);
	}
	public WebElement acads() {
		return driver.findElement(acad);
	}
	public WebElement acaLinks() {
		return driver.findElement(acaLink);
	}
	public WebElement child() {
		return driver.findElement(childl);
	}	
	public WebElement eduL() {
		return driver.findElement(edu);
	}
	public WebElement ficL() {
		return driver.findElement(fic);
	}
	public WebElement harrpL() {
		return driver.findElement(harryp);
	}
	public WebElement nonficL() {
		return driver.findElement(nonf);
	}
}

