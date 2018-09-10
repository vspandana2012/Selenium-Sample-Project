package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//To launch any url first launch the browser 
		
		//1.Launching firefox browser:
		//Use geckodriver - class in selenium.
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nbarnana\\Desktop\\Selenium Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();//Launch Firefox browser//Firefox driver is a class which implements Webdriver interface
        
		//2.Launching chrome browser
		//Use chromedriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nbarnana\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Launch Chrome browser
		driver.get("http:\\www.google.com");//enter URL
		
		String title = driver.getTitle();//gets the title name which returns a string
		System.out.println(title);
		
		//validation point :
		//to verify whether the title is correct or not.
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}else {
			System.out.println("Incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource()); //We dont use this method but it is useful for interview
		
		driver.quit();//to close or quit the browser
		
		//Firebug and firepath addons must be downloaded for the doing any operations(example like filling the forms) on the webpage in mozilla firefox.
		//
		
		
	}

}
