package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.BathSensePage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.JavaUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BathSense {
	WebDriver driver = DriverFactory.getDriver();
	BathSensePage bathSense = new BathSensePage(driver);
	WebDriverUtility utility = new WebDriverUtility();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

	@When("scroll down and click on BathSense")
	public void scroll_down_and_click_on_bath_sense() throws InterruptedException {

		
		WebElement bath = bathSense.getOurDivisions();
		Assert.assertTrue(bath.isDisplayed(), "'Our Divisions' section is not visible");
		javaScriptUtil.jsScrollIntoView(true, bath);		

		
		try {
			WebElement formPopup = wait.until(ExpectedConditions.elementToBeClickable(bathSense.getHandleFormPops()));
			 Assert.assertTrue(formPopup.isDisplayed(), "Form pop-up is not displayed");
			formPopup.click();
			System.out.println("Form pop-up closed successfully.");
		} catch (Exception e) {
			System.out.println("No form pop-up found: " + e.getMessage());
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(bathSense.getWaterproofPopups())).click();
		} catch (TimeoutException e) {
			System.err.println("No waterproof pop-up found or could not be clicked: " + e.getMessage());
		}

		
		utility.javascriptClick(driver, bathSense.getBathsense());
		utility.switchToTabOnTitle(driver, "User will navigate to Bath sense page");
		Reporter.log("User will navigate to Bath Sense Page", true);


	}

	@When("click on our collections of Faucet & Fittings")
	public void click_on_our_collections_of_faucet_fittings() {
		WebElement element = bathSense.getFaucetFittings();
		 Assert.assertTrue(element.isDisplayed(), "'Faucet & Fittings' section is not visible");
		 javaScriptUtil.jsScrollIntoView(true, element);

		 
		utility.mouseHover(driver, bathSense.getCollections());
		bathSense.clickMethodForBathSensePage(bathSense.getCollections());
		Reporter.log("User clicked on collections of Faucet & Fittings", true);

	}


	@When("click on go to homepage")
	public void click_on_go_to_homepage() throws InterruptedException {
		Thread.sleep(2000);
		 Assert.assertTrue(bathSense.getHomePage().isDisplayed(), "Home Page link is not visible");
		 wait.until(ExpectedConditions.elementToBeClickable(bathSense.getHomePage())).click();
		Reporter.log("User clicked on homePage", true);
	}

	@Then("user should be navigated to Treat Your Senses To Inspiring Designs page")
	public void user_should_be_navigated_to_treat_your_senses_to_inspiring_designs_page() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(bathSense.getInspringDesigns().isDisplayed(),
				"Treat your senses to inspiring designs page is displayed");
		Reporter.log("User should navigate to treat your senses to inspiring designs page", true);
	}

}
