package com.bit.support;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A
{
	FirefoxDriver dr=new FirefoxDriver();
	
	@Before
	public void m1()
	{
		System.out.println("This is for Before");
		dr.get("http://www.facebook.com");
		
	}

	@Test
	public void m2()
	{
		System.out.println("test1");
		dr.findElement(By.id("email")).sendKeys("kk");
		
				
		
	}
	@Test
	public void m3()
	{
		System.out.println("test2");
		dr.findElement(By.id("u_0_1")).sendKeys("kawkab");
		dr.findElement(By.id("u_0_3")).sendKeys("ahmed");
	}
	
	@After
	public void m4()
	{
		System.out.println("this is for after");
		dr.quit();
	}
}
