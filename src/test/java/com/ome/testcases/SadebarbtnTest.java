package com.ome.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.LoginPage;
import com.pom.oem.sidebarPAGE;
import com.utilities.oem.ConfigReader;

public class SadebarbtnTest extends Base {
public 	sidebarPAGE sbp; 
 public LoginPage lp;
 
 
@Test
public void sidebarmoudle() throws InterruptedException {
	
   lp = new LoginPage(driver);
	lp.enterUsername(ConfigReader.getProperty("username"));
	lp.enterPassword(ConfigReader.getProperty("password"));
	lp.clickLogin();
 
	 sbp = new sidebarPAGE(driver);

	 sbp.sidebarbtn();
	 
}




}