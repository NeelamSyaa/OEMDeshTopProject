package com.ome.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.LoginPage;
import com.pom.oem.sidebarPAGE;
//@Test(priority = 6)
public class SadebarbtnTest extends Base {
public 	sidebarPAGE sbp; 
 public LoginPage lp;
 
 
@Test(dataProvider ="sidebarmoudle")
public void sidebarmoudle(String um ,String Password ) throws InterruptedException {
	
   lp = new LoginPage(driver);
   lp.Usernamelogin(um);
   lp.passwordlogin(Password);
   lp.loginbtnlogin();
 
	 sbp = new sidebarPAGE(driver);

	 sbp.sidebarbtn();
	 
}


@DataProvider (name ="sidebarmoudle")
	public static Object [][] sidebarbtn(){
		return new Object[][] {
			{"admin ","admin"}
	
};

}}