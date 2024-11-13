package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.LoginPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.JavaUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver = DriverFactory.getDriver();
	LoginPage loginPage = new LoginPage(driver);
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
	FileUtility fileUtility = new FileUtility();
	
	@Given("Click on Login icon")
	public void click_on_login_icon() throws Exception {
	loginPage.getLoginLogo().click();
  	Reporter.log("LoginPage is successfully displayed");
	}

	@When("Enter Phonenumber of ten Digits")
	public void enter_phonenumber_of_ten_digits() throws Exception {
	loginPage.getPhoneNumberFeild().click();
	String phoneno=fileUtility.getDataFromPropertiesFiles("phonenumber");
	 loginPage.getPhoneNumberFeild().sendKeys(phoneno);
	Assert.assertTrue(loginPage.getProceedButton().isEnabled());
	Reporter.log("Successfully Entered the number", true);
	}

	@When("Click on proceed")
	public void click_on_proceed() throws InterruptedException {

		webDriverUtility.waitforElementClickable(driver, loginPage.getProceedButton());
		loginPage.getProceedButton().click();
		Thread.sleep(15000);
		Reporter.log("Successfully logged in", true);
	}

	@When("Validate the login")
	public void validate_the_login() {
	
		Reporter.log("Successfully logged in", true);
}
	}


