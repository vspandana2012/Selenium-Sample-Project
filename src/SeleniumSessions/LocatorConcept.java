package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nbarnana\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		//1. xpath:
		
//		driver.findElement(By.xpath("//input[@name='username' and @type='text']")).sendKeys("naveenk");
//		driver.findElement(By.xpath("//input [@name='password']")).sendKeys("test@123");
		
		//2. id:
		
//		driver.findElement(By.id(""));//if id is not available use xpath
		
		//3. name:
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		//4. link text:
		
		
		
		
//		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", login);

	}

}
