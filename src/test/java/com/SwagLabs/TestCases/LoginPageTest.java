package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest
{
  @Test(priority = 0)
  public void verifyApplicationTitle() {
	  lp.verifyTitle();
	  
  }
  
  @Test(priority = 1)
  public void verifyApplicationUrl() {
	  lp.verifyUrl();
	  
  }
  
  @Test(priority = 2)
  public void verifyApplicationLogin() {
	  lp.verifyLogin("standard_user", "secret_sauce");
	  
  }
  
  
  
}
