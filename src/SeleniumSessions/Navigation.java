package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nbarnana\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//get() vs navigate().to() 
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.freecrm.com");//get and navigate are used to get the urls but the navigate is used if you want to move to external url.
		
		//back and forward buttons simulation
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();//to refresh a page
		

	}

}
