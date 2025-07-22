package com.ome.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.AddNewDevicePage;
import com.pom.oem.LoginPage;
import com.utilities.oem.ConfigReader;



@Test(enabled = false)
public class AddNewDeviceTest extends Base{
	AddNewDevicePage ad;
	 LoginPage PLd;
	 
	public void addingsigledata() throws IOException, InterruptedException {
		ad = new AddNewDevicePage(driver);
		ConfigReader.loadProperties();
	    PLd = new LoginPage(driver);    
	    PLd.enterPassword("username");
	    PLd.enterPassword("password");
	    PLd.clickLogin();
	    Thread.sleep(5000); 
	

	    ad.SrialNumber();
	    String sn = ConfigReader.getProperty("Serial_No");
	   
	    ad.SerialNoTextField(sn);
	
		String im1 = ConfigReader.getProperty("imei");
	    ad.imeinumbertext(im1);
	    
		String dmtata = ConfigReader.getProperty("DeviceMake");
	    ad.devicemaketext(dmtata);
	   
	    String dmodelblockbox = ConfigReader.getProperty("DeviceModel");
	    ad.devicemodeltext(dmodelblockbox);
	  
	    ad.AddNewDevice();
	    Thread.sleep(2000);
	WebElement error = driver.findElement(By.xpath("//div[@class=\"MuiBox-root css-mhi1fl\"]"));
	System.out.println(error.getText());
	//String expedreulte ="Error: Failed to add device: Error: Failed to add device: error: duplicate key value violates unique constraint \"tcu_inventory_unique\"";
		//Assert.assertEquals(error, expedreulte);
	if(error.getText().contains("duplicate key value violates unique constraint")) {
	    System.out.println("Failed: Duplicate IMEI number");
	} else {
	    System.out.println("Error not displayed");
	}
}
	    
	    
}
