package dataprovider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLogin2 extends BaseTest {
	
	@Test(dataProvider="getData")
	public void validateLoginTest(String username,String password,String expTitle) 
	{
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	   driver.findElement(By.xpath("//input[@name='login']")).click();
	   
	   Assert.assertEquals(driver.getTitle(), expTitle);
		
	}
	
	@DataProvider
	public Object[][]getData() throws IOException{
		
		FileInputStream fis= new FileInputStream("src\\test\\resources\\TestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet ws = wb.getSheet("credentials");
		 
		//getPhysicalNumberOfRows == returns 5
		
		int noOfRows=ws.getPhysicalNumberOfRows()-1;
		
		//getLastRowNum == returns 4 but not prefered if there are blank rows
		
		//ws.getLastRowNum();
		
		//getPhysicalNumberOfCells == returns 3
		
		int noOfCells=ws.getRow(0).getPhysicalNumberOfCells();
		
		
		Object[][] data = new Object[noOfRows][noOfCells];
		
		for(int i=0;i<noOfRows;i++)
		{
			
			for(int j=0;j<noOfCells;j++)
			{
				data[i][j]=ws.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		
		return data;
		
	}

}
