package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nbarnana\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();//Click Go Button
		
		Thread.sleep(5000);//To wait or pause the script for five seconds(5000ms).
		
		Alert alert = driver.switchTo().alert();//Switching from the main window to the popup window, which gives the control on the popup window
		
		String text = alert.getText();//To get the text present on the popup window
		
		if(text.equals("Please enter a valid user name") ) { //validation point
			System.out.println("Correct alert message");
		}else {
			System.out.println("Incorrect alert message");
		}
		
		alert.accept();//To click ok or yes option
		//alert.dismiss();//To click cancel or no option
		
		
	}

}
