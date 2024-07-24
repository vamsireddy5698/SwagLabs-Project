package com.SwagLabs.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;

public class BaseTest {
	
	public WebDriver driver ;
	public LoginPage lp;
	public InventoryPage ip;
	
	
	
	
	@BeforeMethod
	@BeforeTest()
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
	}
	
	@AfterMethod
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
