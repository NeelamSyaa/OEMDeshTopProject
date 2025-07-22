package com.ome.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.LoginPage;
import com.pom.oem.SampleFilePage;


@Test(enabled = false)
public class DwonlSimpleFileTest extends Base{ 
	

	SampleFilePage dp;

    LoginPage LPDP;
	
	@Test(priority = 1, dataProvider = "simpleFiledwonloddata")
	public void simpleFiledwonlod(String username, String password) throws InterruptedException {
	    
        LPDP = new LoginPage(driver);       
        LPDP.enterPassword("username");
        LPDP.enterPassword("password");
        LPDP.clickLogin();
	    dp = new SampleFilePage(driver);
	    

	   dp.simplefileDeviceManagerPage();
	    Thread.sleep(5000);
	   WebElement element = driver.findElement(By.xpath("//button[normalize-space(text())='Sample File']"));
	   Assert.assertTrue(element.isDisplayed(), " samplefile button is not visible.");
	}


    

    }
