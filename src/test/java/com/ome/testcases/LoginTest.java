package com.ome.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.LoginPage;
import com.utilities.oem.ConfigReader;

@Test(enabled = true)
public class LoginTest extends Base {
	
	public void loginTest() throws IOException {
	    LoginPage lp = new LoginPage(driver);
	    ConfigReader.loadProperties();
	    lp.enterPassword(ConfigReader.getProperty("username"));
	    lp.enterPassword(ConfigReader.getProperty("password"));
	    lp.getCurrentUrl();
	    lp.getTitle();
	    
	    
lp.clickLogin();

	    Assert.assertTrue(lp.isSuccessMessageDisplayed(), "Success message not displayed");
	    Assert.assertEquals(lp.getTitle(), "OEM Tool", "Unexpected title post-login");
	    System.out.println("Page URL after login: " + lp.getCurrentUrl());
	}



}
