package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void LoginTest() {
		System.out.println("Login Test");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods="LoginTest")//dependsOnMethods states that HomePageTest() is dependent on LoginTest()
	//If the LoginTest() passes then the HomePageTest() is executed
	//If the LoginTest() fails then the HomePageTest() is not considered and it is skipped in order to save the time.
	public void HomePageTest() {
		System.out.println("Home Page Test");
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void SearchPageTest() {
		System.out.println("Search Page Test");
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void RegisterPageTest() {
		System.out.println("Register Page Test");
	}

}
