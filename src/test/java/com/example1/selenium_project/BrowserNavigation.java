package com.example1.selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigation {
	
	public static void main(String[] args) throws InterruptedException {
		
		//path to folder
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\snehil.gupta\\jee eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		System.out.print(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		
		//driver.wait(5);
		
		driver.close();
		
		driver.quit();
//		
//		driver.get(null);
//		
	}
	
}
