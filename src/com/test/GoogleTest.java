package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	//1 //4 //7 //10 //13 //16
	@BeforeMethod 
	public void setUp() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nbarnana\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.google.com");
	
	}
	
	//The execution of the tests is random.In order follow a particular order we can use keyword "priority".Based on this priority the tests are executed. The BeforeMethod and AfterMethod are executed before and after each test.
	//2
	@Test(priority = 1,groups = "Title")
	public void googleTitleTest() {
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	//5
	@Test(priority = 2, groups = "Logo")
	public void googleLogoTest() {
		
	boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();//.isDisplayed() method is use to check whether the element is displayed or not.It returns a boolean value stating true or false.
	
	}
	
	//8
	@Test(priority = 3, groups = "Link Test")
	public void mailLinkTest() {
		
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	//11
	@Test(priority = 4, groups = "Test")
	public void test1() {
		System.out.println("test1");
	}
	
	//14
	@Test(priority = 5, groups = "Test")
	public void test2() {
		System.out.println("test2");
	}
	//17
	@Test(priority = 6, groups = "Test")
	public void test3() {
		System.out.println("test3");
	}
	
	//3 //6 //9 //12 //15 //18
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
