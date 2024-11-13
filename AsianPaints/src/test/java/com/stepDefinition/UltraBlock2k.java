package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.Homepage;
import com.elementRepository.UltraPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UltraBlock2k {
	
	WebDriver driver = DriverFactory.getDriver();
	UltraPage ultraPage = new UltraPage(driver);
	WebDriverUtility utility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	@When("click on Ultra Block products")
	public void click_on_ultra_block_products() throws InterruptedException {
		Thread.sleep(2000);
		ultraPage.getUltrablock().click();
		 Reporter.log("User shoULD Click On Ultra Block Products ", true);
	}

	@Then("user should be able to view ultra block products page")
	public void user_should_be_able_to_view_ultra_block_products_page() throws InterruptedException {
		Assert.assertTrue(ultraPage.getUltraHeader().isDisplayed(),"User should be able to view ultra block");
		Thread.sleep(2000);
      Reporter.log("User should view ultra products", true);
	}



}
