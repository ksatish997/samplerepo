package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {
	
	public static void main(String[] args) throws Exception {
		
		// open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// maximize the browser
		//driver.manage().window().maximize();
		
		// open URL
		driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");
		
		// sleep
		Thread.sleep(3000);
		
		// run the java script
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		// scroll down by 400 pixels
		jse.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000); 
		
		// scroll up by 200 pixels
		jse.executeScript("window.scrollBy(0,-200)");
	}

}
