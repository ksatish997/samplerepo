package TestNg;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShots {

	@Test
	public void screenshots() throws Exception {

		// open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// open application
		driver.get("https://www.emirates.com/in/english/");

		// take screenshot
		TakesScreenshot caputer = (TakesScreenshot) driver;

		File source = caputer.getScreenshotAs(OutputType.FILE);

		// destination
		String path = "C:\\Users\\ksati\\eclipse-workspace\\automation\\src\\test\\resources\\screenshots";
		File dest = new File(path + "\\emirates_screen.jpg");
		
		FileUtils.copyFile(source, dest);

	}

}
