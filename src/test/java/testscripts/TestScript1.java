package testscripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestScript1 extends BaseTest {
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("In Before method of TestScript1");
	}
	
	@Test
	public void m1()
	{
		System.out.println("In m1 method");
	}
	
	@Test
	public void m2()
	{
		System.out.println("In m2 method");
	}
	
	@Test
	public void m3()
	{
		System.out.println("In m3 method");
	}

}
