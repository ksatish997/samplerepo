package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitForm {
	
	public static void main(String[] args) throws Exception {
		
		// open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// open application
		driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");
		
		// enter text
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("sai");
		
		
		// check box
	    driver.findElement(By.xpath("//*[@type='checkbox']")).click();
	    
	    // enter comments
	    driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("laptops");
	    
	    // select form list
	    WebElement list  = driver.findElement(By.xpath("//select[@name='countries']"));
	    Select countrylist = new Select(list);
	    countrylist.selectByVisibleText("Argentina");
	    
	    // multi select list
	    WebElement multi  = driver.findElement(By.xpath("//select[@name='computerbrands']"));
	    Select computerbrands = new Select(multi);
	    computerbrands.deselectByVisibleText("DELL");
	    computerbrands.selectByVisibleText("HP");
	    
	    // enter password
	    driver.findElement(By.xpath("//*[@type='password']")).sendKeys("12345");
	    
	    // click radio button
	    driver.findElement(By.xpath("//input[@value='good']")).click();
	    
	    // click choose file
	    driver.findElement(By.xpath("//*[@name='photo']")).sendKeys("C:\\Users\\ksati\\Desktop\\ram");
	    
	    
	    // submit
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	    
	    // enter sleep
	    
	    Thread.sleep(10);
	    
	    // handle the alert (or) popup
	    String alerttext = driver.switchTo().alert().getText();
	    
	    System.out.println("alerttext is:"+alerttext);
	    driver.switchTo().alert().accept();
	    
	    // click the conform box
	    driver.findElement(By.xpath("//*[@value='Display a confirm box']")).click();
	    
	    // alert
	    String alert = driver.switchTo().alert().getText();
	    
	    System.out.println("alert is:"+alert);
	    driver.switchTo().alert().accept();
	    
	    // to click cancel button in alert (or) popup
	    //driver.switchTo().alert().dismiss();
	    
	    // enter date
	    driver.findElement(By.xpath("//input[@id='demo1']")).sendKeys("01/04/2022");
	    
	    // close browser
	    //driver.close();
	    
	}

}
