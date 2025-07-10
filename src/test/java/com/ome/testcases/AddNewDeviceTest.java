package com.ome.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.AddNewDevicePage;
import com.pom.oem.LoginPage;
import com.utilities.oem.ConfigReader;




public class AddNewDeviceTest extends Base{
	AddNewDevicePage ad;
	 LoginPage PLd;
	 @Test( dataProvider = "addingsigledata")
	public void addingsigledata( String username,String password ) throws IOException, InterruptedException {
		ad = new AddNewDevicePage(driver);
		ConfigReader.loadProperties();
		System.out.println("Username: " + username);
	    System.out.println("Password: " + password);
	    PLd = new LoginPage(driver);    
	    PLd.Usernamelogin(username);;
	    PLd.passwordlogin(password);
	    PLd.loginbtnlogin();
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
		
	}
	    @DataProvider(name = "addingsigledata")
	    public Object[][] getData() {
	        return new Object[][] {
	            {"admin", "admin"},
	           // {"Password", "admin"}
	        };
	    }
}
