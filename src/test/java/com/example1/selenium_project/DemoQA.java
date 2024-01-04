package com.example1.selenium_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoQA {
	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\snehil.gupta\\jee eclipse-workspace\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\snehil.gupta\\jee eclipse-workspace\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver=new ChromeDriver();
		
		//working
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://demoqa.com/text-box");
//		driver.findElement(By.id("userName")).sendKeys("hello");
//		driver.get("https://rally1.rallydev.com/slm/login.op");
//		driver.findElement(By.name("j_username")).sendKeys("ipsita");

//		driver.get("https://demoqa.com/links");
//		driver.findElement(By.linkText("Home")).click();
//		driver.findElement(By.partialLinkText("Content")).click();
//		System.out.println(driver.findElement(By.id("linkResponse")).getText());
//		Thread.sleep(5000);
//		driver.quit();
		
		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://demoqa.com/text-box");
////		//elements will return list and element will return singular 
////		//you can use various things inside element BY.<something>
//		List<WebElement> e = driver.findElements(By.tagName("input"));
//		System.out.println(e.get(0).getAttribute("placeholder"));
//		
		
		
//		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		//selecting element from radio button
		//driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
//		WebElement dropdown= driver.findElement(By.xpath("//select[@name='fromPort']"));
//		Select sel=new Select(dropdown);
//		//sel.selectByIndex(3);
//		//sel.selectByValue("London");
//		Thread.sleep(5000);
		
		
//		WebElement listbox=driver.findElement(By.xpath("select[@id='fruits']"));
//		Select sl=new Select(listbox);
//		System.out.println(sl.isMultiple());
		
//		driver.get("https://output.jsbin.com/osebed/2");
//		WebElement dropdown= driver.findElement(By.xpath("//select[@id='fruits']"));
//		Select sel=new Select(dropdown);
//		sel.selectByIndex(3);
//		//System.out.print(sel.isMultiple());
//		//sel.selectByValue("Apple");
//		Thread.sleep(5000);
//		sel.deselectByIndex(3);
//		
//		Thread.sleep(5000);
		
//		driver.get("https://demoqa.com/buttons");
//		WebElement dcb= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
//		Actions actions=new Actions(driver);
//		actions.doubleClick(dcb).perform();
//		Thread.sleep(5000);
		
		
//		driver.get("https://demoqa.com/droppable");
//		WebElement draggable= driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement droppable= driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
//		driver.manage().window().maximize();
//		
//		Actions builder=new Actions(driver);
//		
//		builder.dragAndDrop(draggable, droppable).perform();
//		Thread.sleep(5000);
		
//		driver.get("https://demoqa.com/alerts");
//		Actions alrt=new Actions(driver);
//		WebElement alrtbtn= driver.findElement(By.xpath("//button[@id='alertButton']"));
//		alrt.click(alrtbtn).perform();
////		System.out.print(driver.switchTo().alert().getText());
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(5000);
//		
		
//		driver.get("https://demoqa.com/browser-windows");
//		Actions a=new Actions(driver);
//		WebElement alert1=driver.findElement(By.xpath("//button[@id='tabButton']"));
//		String s=driver.getWindowHandle();
//		System.out.println(s);
//		a.click(alert1).perform();
//		
//		Set<String> ss=driver.getWindowHandles();
//		
//		for(String se:ss)
//			System.out.print(se);
//		
//		Thread.sleep(5000);
		
		
//		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		
//		WebElement element = driver.findElement(By.xpath("//table[@id='customers']/tbody"));
//		
//		//List<WebElement> we=element.findElements(By.tagName("tr")).size();
//		
//		System.out.print(element.findElements(By.tagName("tr")).size());
//		
//		Thread.sleep(5000);
		
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(".//ScreenShots//Test1.png");
		FileUtils.copyFile(SrcFile, DestFile);

		Thread.sleep(5000);
		
	}
}
