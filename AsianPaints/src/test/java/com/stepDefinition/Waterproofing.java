package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.Homepage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Waterproofing {
	WebDriver driver = DriverFactory.getDriver();
	Homepage homepage = new Homepage(driver);
	WebDriverUtility utility = new WebDriverUtility();

	@Given("Browser should be launched and URL should be navigated")
	public void browser_should_be_launched_and_url_should_be_navigated() throws Exception {
		
		utility.handlePopups(driver);
		Actions act = new Actions(driver);
		act.moveByOffset(0, 0).click();
	
		Thread.sleep(4000);
		FileUtility fileUtility = new FileUtility();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = fileUtility.getDataFromPropertiesFiles("url");
		Assert.assertEquals(actualUrl, expectedUrl, "Url is not navigated");
		Reporter.log("Browser is launched");
	
	}

	@When("User should be able to mouse hover on Waterproofing link")
	public void user_should_be_able_to_mouse_hover_on_waterproofing_link() throws InterruptedException {
		utility.mouseHover(driver, homepage.getHoverOnWaterProofing());
		Thread.sleep(2000);
		Reporter.log("User should be able to mouse hover on waterproofing link", true);
	}

	@When("User should be able to see the sub-options in Waterproofing link when displayed")
	public void user_should_be_able_to_see_the_sub_options_in_waterprocofing_link_when_displayed() {
		 Assert.assertTrue(homepage.getHoverOnWaterProofing().isDisplayed());
		Reporter.log("User should be able to see the sub-options in Waterproofing");
	}
	@When("click on Bathrooms link")
	public void click_on_bathrooms_link() throws InterruptedException {
		Thread.sleep(2000);
		homepage.clickMethodForWaterProofingPage(homepage.getClickOnBathrooms());
//		homepage.getClickOnBathrooms().click();
        Reporter.log("User clicked on Bathrooms link", true);   
	}
	
	@When("Click on cart link")
	public void click_on_cart_link() {
		homepage.clickMethodForWaterProofingPage(homepage.getAddToCart());
	   //homepage.getAddToCart().click();
	   Reporter.log("User clicled on cart link",true);
	}
	
	@Then("Cart link should be displayed")
	public void cart_link_should_be_displayed() {
		 Assert.assertTrue(homepage.getCartEmpty().isDisplayed());
     Reporter.log("Cart should be displayed", true);
	}

	@When("Click on store locator link")
	public void click_on_store_locator_link()  {  
		homepage.clickMethodForWaterProofingPage(homepage.getStoreLoc());
//	    homepage.getStoreLoc().click();
	    Reporter.log("Store locator should be clicked", true);
	}

	@Then("store locator page is displayed")
	public void store_locator_page_is_displayed() throws InterruptedException {
	   Thread.sleep(2000);
	   Assert.assertTrue(homepage.getLocationPage().isDisplayed());
     Reporter.log("User is able to view store locator page", true);
	}
	@Then("Browser should be closed")
	public void browser_should_be_closed() {
		Reporter.log("Browser should be closed",true);

	}
}