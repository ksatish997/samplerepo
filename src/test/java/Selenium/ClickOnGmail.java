package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnGmail {
	
	public static void main(String[] args) {
		
		// certain commands or methods to work with browser
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		// open Google.com
		 driver.get("https://www.google.com/");
		 
		 // close browser
		 driver.close();
	}

}
