package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Nbarnana\\\\Desktop\\\\Selenium Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		//type="file" should be present for Browse/AttachFile/UploadFile buttons
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Nbarnana\\Desktop\\selenium.html");
	}

}
