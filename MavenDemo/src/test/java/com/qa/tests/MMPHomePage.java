package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MMPHomePage {
	
	
	@Test
	public void mmpTest() {		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000");
		System.out.println("Opend URL -- - "+driver.getTitle());		
		driver.close();
	}

}
