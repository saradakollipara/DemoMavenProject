package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleHomePage {
	
	@Test
	public void test() {		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Opend URL -- - "+driver.getTitle());		
		driver.close();
	}
}
