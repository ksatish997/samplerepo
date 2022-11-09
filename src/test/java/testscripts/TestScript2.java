package testscripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestScript2 extends BaseTest{
	
	@BeforeMethod
	public void setUp2()
	{
		System.out.println("In Before method of TestScript2");
	}
	
	@Test
	public void m4()
	{
		System.out.println("In m4 method");
	}
	
	@Test
	public void m5()
	{
		System.out.println("In m5 method");
	}
	
	@Test
	public void m6()
	{
		System.out.println("In m6 method");
	}

}
