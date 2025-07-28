package com.SIMManagement.test;

import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.LoginPage;
import com.pom.oem.SIMManagementPom;
import com.utilities.oem.ConfigReader;

public class SIMManagementsidebar extends Base {
	SIMManagementPom smp;
	 LoginPage lp;
	 @Test
	public void sadebarclick() throws InterruptedException {
	
         smp = new SIMManagementPom(driver);
       lp  = new LoginPage(driver);
       lp.enterUsername(ConfigReader.getProperty("username"));
       lp.enterPassword(ConfigReader.getProperty("password")); 
       lp.clickLogin();
       Thread.sleep(5000);
       smp.SIMManagementbtn();
	}
}
