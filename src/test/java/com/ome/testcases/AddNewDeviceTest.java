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
import com.utilities.oem.DataGenerator;



@Test(enabled = true)
public class AddNewDeviceTest extends Base{
	 AddNewDevicePage ad;
	 LoginPage PLd;
	 @Test
	public void addingsigledata() throws IOException, InterruptedException {
		ad = new AddNewDevicePage(driver);
		ConfigReader.loadProperties();
	    PLd = new LoginPage(driver);    
	    PLd.enterUsername(ConfigReader.getProperty("username"));
	    PLd.enterPassword(ConfigReader.getProperty("password"));
	    PLd.clickLogin();
	    Thread.sleep(5000); 
	   ad.SingledriveAddbtn();
	   ad.SerialNoTextinput(DataGenerator.generateSerial());
	   ad.imeinumberinput(DataGenerator.generateIMEI());
	   ad.devicemakeinput();
	   ad.devicemodelinput();
	   ad.AddNewDeviceclose(); 	   
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
