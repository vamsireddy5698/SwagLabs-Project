package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locators
	private By usern = By.id("user-name");
	private By pwd = By.id("password");
	private By lbtn = By.name("login-button");
	
	//Actions
	
	public void verifyTitle()
	{
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Swag Labs"), "Test Fail: Title is not Matched");
		System.out.println("Test Pass: Title is Matched");
	}
	
	public void verifyUrl()
	{
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("demo"), "Test Fail: Url is not Matched");
		System.out.println("Test Pass: Url is Matched");
	}
	
	public void verifyLogin(String un, String pss)
	{
		driver.findElement(usern).sendKeys(un);
		driver.findElement(pwd).sendKeys(pss);
		driver.findElement(lbtn).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Test Fail: login Unsuccessful");
		System.out.println("Login Completed");
	}
	
	

	
	

}
