package com.ome.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.oem.Base;
import com.pom.oem.LoginPage;

//@Test(priority = 1)
public class LoginTest extends Base {
	

    @Test(dataProvider = "loginData")
    public void loginTest(String uname, String upassword) {
        LoginPage lp = new LoginPage(driver);
        lp.Usernamelogin(uname);
        lp.passwordlogin(upassword);
        lp.loginbtnlogin();
        lp.successMessagelogin();
        lp.getcurrentURl();
        lp.gettitle();
        String expectedTitle = "OEM Tool";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Login failed or wrong page loaded.");
    }

    @DataProvider(name = "loginData")
    public Object[][] loginCredentials() {
        return new Object[][] {
            {"admin", "admin"},
           // {"admin", "wrongpass"},
           // {"", ""}
        };
    }

}
