package com.ome.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.LoginPage;
import com.pom.oem.SampleFilePage;
import com.utilities.oem.ConfigReader;


@Test(enabled = true)
public class DwonlSimpleFileTest extends Base{ 
	

	SampleFilePage dp;

    LoginPage LPDP;
	
	@Test()
	public void simpleFiledwonlod() throws InterruptedException, IOException {
		ConfigReader.loadProperties();
        LPDP = new LoginPage(driver);       
        LPDP.enterUsername( ConfigReader.getProperty("username"));
        LPDP.enterPassword(ConfigReader.getProperty("password"));
        LPDP.clickLogin();
	    dp = new SampleFilePage(driver);
	    

	   dp.simplefileDeviceManagerPage();

	   WebElement element = driver.findElement(By.xpath("//button[normalize-space(text())='Sample File']"));
	   Assert.assertTrue(element.isDisplayed(), " samplefile button is not visible.");
	}


    

    }
