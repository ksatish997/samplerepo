package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	
	public static void main(String[] args) {
		
		// open browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// open application
		
		driver.get("https://www.facebook.com/");
		
		// click on create account
		
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		// sync
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// enter details
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ravi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
		
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("89199");
		driver.findElement(By.xpath("//*[@id='password_step_input']")).sendKeys("1234");
		
		// enter date of birth
		
	    WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
	    Select birthday = new Select(day);
	    birthday.selectByVisibleText("15");
	    
	    WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	    Select birthmonth = new Select(month);
	    birthmonth.selectByVisibleText("Feb");
	    
	    WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	    Select birthyear = new Select(year);
	    birthyear.selectByVisibleText("1996");
	    
	    // click Gender option
	    
	    driver.findElement(By.xpath("//label[text()='Male']")).click();
	    
	    // click signup button
	    
	    driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	   
	   
		
		
	}
	

}
