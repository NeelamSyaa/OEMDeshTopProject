package com.ome.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.DwonloadDataPage;
import com.pom.oem.LoginPage;
import com.utilities.oem.ConfigReader;

public class DwonloadDatatext extends Base {
	DwonloadDataPage ddb;
	LoginPage lp;
@Test
	public void datadwonloadbtn() throws IOException, InterruptedException {
		ConfigReader.loadProperties();
		ddb = new DwonloadDataPage(driver);
		lp = new LoginPage(driver);
		lp.enterUsername(ConfigReader.getProperty("username"));
		lp.enterPassword(ConfigReader.getProperty("password"));
		Thread.sleep(5000);
		lp.clickLogin();
		Thread.sleep(5000);
		ddb.dwonloadgelobal();

	}
}
