package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nbarnana\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//By using id locator
		//driver.findElement(By.id("username")).sendKeys("naveenk");
		
		//By using customized xpath
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("naveenk");
		
		//By using dynamic or customized xpath using contains() function
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("test@123");
		
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", login);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
		//dynamic id
		//id = test_123
		//By.id("test_123")
		//id = test_456
		
		//driver.findElement(By.xpath("//input(contains(@id,'test_s')")).sendKeys("Test");
		
		//starts-with()
		//id = test_789
		//id = test_test_123456
		//If the xpath changes dynamically like this we can use starts-with() function as the starting part of the id is similar in all the cases.
		
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Test");
		
		//ends-with()
		//id = 123_test
		//id = 456_test
		//If the ending part of the id is similar then we can use ends-with() function 
		
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test')]")).sendKeys("Test");
		
		//for links : we can use linktext or custom xpath
		//fro writing custom xpath  use contains(test(),'') function
		//all the links will have html <a> tag
		
		driver.switchTo().frame("mainpanel");//switching to frame to get control over all the items present in that frame.
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Companies')]")).click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			
	}

}
