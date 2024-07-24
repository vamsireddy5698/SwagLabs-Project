package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class InventoryPage {
	
	private WebDriver driver;
	
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	// Locators
	private By productList = By.xpath("//div[@class='inventory_list']//div[@class ='inventory_item_name ']");
	private By addbtn = By.id("add-to-cart");
	private By cartBtn = By.id("shopping_cart_container");
	
	
	//Actions
	
	public void verifyCountOfProducts()
	{
		int count = driver.findElements(productList).size();
		Assert.assertEquals(count, 6);
		System.out.println("Test Pass:Total products are"+count);
	}
	
	public void productList()
	{
		List<WebElement> list = driver.findElements(productList);
		System.out.println("-----Product Details---");
		for(WebElement i : list)
		{
			System.out.println(i.getText());
		}
	}
	
	public void clickOnCart()
	{
		driver.findElement(cartBtn).click();
		System.out.println(" Cart Page Launched");
	}
}
