package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		//Three different types of PopUps
		//1.alerts - JavaScript PopUp -- Alert API(accept(),dismiss() class : AlertPopUpHandle)
		//2.File Upload PopUp -- Browse button (type="file",sendKeys(path) class : HandleFileUploadPopUp)
		//3.Browser Window PopUp -- Advertisement PopUp (windowHandler API - getWindowHandles() class : HandleWindowPopUp)
		
		System.setProperty("webdriver.chrome.driver","");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath(xpath )).click();
		
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();//windowHandles is used as we have more than one window here.This gives info about the window ids and returns a Set object which is of String type.
		Iterator<String> it = handler.iterator();//This method is used to get the values of the Set object as it doesn't store the values using indexes.It returns a Iterator object
		
		//The it object doesn't points at the place where the value is present, it is present somewhere at the top the set object.
		//To get the value for the Set object use .next() method which gives points to the value of the Set object.Again use the same method to get the next value so that it shifts to the next value of the Set object
		
		String parentWindowId = it.next();//to point to the first value of the set i.e the parent window id 
		System.out.println("parent window id is " + parentWindowId);
		
		String childWindowID = it.next();//to point to the next element of the set i.e child window id
		System.out.println("Child Window Id is " + childWindowID);
		
		driver.switchTo().window(childWindowID);//switch to the child popup window or to get control over the child window
		
		Thread.sleep(2000);
		
		System.out.println("child window title" +driver.getTitle());//to get the title of the child window
		
		driver.close();//to close the popup window.
		//Don't use driver.quit() as it closes both the windows
		
		driver.switchTo().window(parentWindowId);//to get control over the parent window
		
		Thread.sleep(2000);
		
		System.out.println("parent window title" +driver.getTitle());
		
		

	}

}
