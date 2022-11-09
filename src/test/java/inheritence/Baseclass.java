package inheritence;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static void main(String[] args) {
		// open browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// open application
		
		driver.get("https://www.facebook.com/");
		
		// click on create button
		
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		
		// sync
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// enter username pas...etc using x-path
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("sravnthi");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("adsgdkdkdkd");
		
		// list selected
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select birthday=new Select(day);
		birthday.selectByVisibleText("16");
		
		WebElement month = driver.findElement(By.xpath("//*[@name='birthday_month']"));
		Select birthmonth = new Select(month);
		birthmonth.selectByVisibleText("Jun");
		
		WebElement year = driver.findElement(By.xpath("//*[@name='birthday_year']"));
		Select birthyear = new Select(year);
		birthyear.selectByVisibleText("2015");
		
		// select gender
		driver.findElement(By.xpath("//*[text()='Male']")).click();
		
		// click signup button
		driver.findElement(By.xpath("//*[@name='websubmit']")).click();
	
		

	}

}
