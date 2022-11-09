package base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public  static WebDriver driver;
	
	public static ExtentReports reports;
	
	public static ExtentTest test;
	
	@BeforeTest
	public void fileSetUp()
	{
		System.out.println("In Before Test method for Files Initialization");
		
		String reportsFolderPath=System.getProperty("user.dir")+"\\reports";
		
		File reportsFolder=new File(reportsFolderPath);
		
		reportsFolder.mkdir();
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
		date=date.replace(":", "-");
		
		String reportFilePath=reportsFolderPath+"\\"+date+".html";
		
		File reportsFile=new File(reportFilePath);
		
		reports=new ExtentReports();
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportsFile);
		
		reporter.config().setDocumentTitle("Adactin Regression Results");
		
		reports.attachReporter(reporter);
		
		
		
	}
	
	@BeforeMethod
	public void browserSetUp()
	{
		test=reports.createTest("Regression Test");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@AfterTest
	public void resultsFlush()
	{
		reports.flush();
	}

}
