package com.example1.selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigation {
	
	public static void main(String[] args) {
		
		//path to folder
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\snehil.gupta\\jee eclipse-workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		
	}
	
}
