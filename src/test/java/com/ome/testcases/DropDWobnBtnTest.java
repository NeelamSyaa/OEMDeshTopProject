package com.ome.testcases;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.LoginPage;
import com.pom.oem.SearchdropdwonDevicePage;
import com.utilities.oem.ConfigReader;
import com.utilities.oem.DataGenerator;



@Test(enabled = true)
public class DropDWobnBtnTest extends Base {
	LoginPage LPDP;
	SearchdropdwonDevicePage sdpdn;
@Test
	public void searchdata() {
		 // Generate dynamic test data
     //   String generatedIMEI = DataGenerator.generateIMEI();
      //  String generatedSerial = DataGenerator.generateSerial();
		sdpdn  =	new SearchdropdwonDevicePage(driver);
	    LPDP = new  LoginPage(driver);	
	    LPDP.enterUsername(ConfigReader.getProperty("username"));
	    LPDP.enterPassword(ConfigReader.getProperty("password"));
	    LPDP.clickLogin();
	sdpdn.SearchbyIMIE();
  	sdpdn.clcikdropdwonmanuSearch();
	sdpdn.Search_bySerialNodrp();
	
		
	}
	
	
}
