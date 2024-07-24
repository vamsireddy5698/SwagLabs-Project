package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseTest 
{
	
	
  @Test(priority = 0)
  public void verifyTotalProducts() 
  {
	  ip.verifyCountOfProducts();
  }
  
  @Test(priority = 1)
  public void verifyProductList() 
  {
	  ip.productList();
  }
  
  @Test(priority = 2)
  public void verifyCartLauch() 
  {
	  ip.clickOnCart();
  }
  
}
