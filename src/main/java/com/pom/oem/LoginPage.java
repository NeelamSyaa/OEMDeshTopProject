package com.pom.oem;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	@FindBy(id = "«r0»")
	private WebElement usernameInput;
	@FindBy(id = "«r1»")
	private WebElement passwordInput;
	@FindBy(xpath = "//form//button[text()=\"LOGIN\"]")
	private WebElement loginbtn;

	@FindBy(xpath = "//div[text()='Success! Logged In']")
	WebElement successMessage;

//	@FindBy(xpath = "//div[contains(text(),'Invalid Username or Password!')]")
//	WebElement errorMessage;
	
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Usernamelogin( String un) {
		usernameInput.clear();
		usernameInput.sendKeys(un);
	}

	public void passwordlogin(String pw) {
		passwordInput.clear();
		passwordInput.sendKeys(pw);
	}

	public void loginbtnlogin() {
		loginbtn.click();
	}

	public void successMessagelogin() {
	    if (successMessage.isDisplayed()) {
	        System.out.println("✅ Login success message displayed");
	    } else {
	        System.out.println("❌ Success message not found");
	    }
	}

	public void getcurrentURl() {
	 
	String url = driver.getCurrentUrl();
	System.out.println(url);
	 
	}
	public void gettitle() {
	 
	String title = driver.getTitle();
	System.out.println(title);
	}
}
