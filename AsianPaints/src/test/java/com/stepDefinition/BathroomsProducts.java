package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.BathroomsPage;
import com.elementRepository.Homepage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BathroomsProducts {

	WebDriver driver = DriverFactory.getDriver();
	BathroomsPage bathroomPage = new BathroomsPage(driver);
	WebDriverUtility utility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	Actions act = new Actions(driver);

	@When("the user should be navigated to the Bathrooms products page")
	public void the_user_should_be_navigated_to_the_bathrooms_products_page() {
		Assert.assertTrue(bathroomPage.getBathroomsproducts().isDisplayed());
		Reporter.log("User should be able to navigate to Bathrooms products page");
	}
	@Then("the user selects the {int} checkbox in the filter")
	public void the_user_selects_the_checkbox_in_the_filter(Integer filter) throws Exception {
		String checkmark = fileUtility.getDataFromExcel("Sheet1", filter, 0);
		switch (checkmark) {
		case "Economy":
			bathroomPage.clickMethodForBathRoomsPage(bathroomPage.getEconomyfilter());
			Thread.sleep(3000);
			Assert.assertTrue(bathroomPage.getEconomyfilter().isEnabled());
			break;
		case "Balconies":
			bathroomPage.clickMethodForBathRoomsPage(bathroomPage.getBalconiesfilter());
			Thread.sleep(3000);
			Assert.assertTrue(bathroomPage.getBalconiesfilter().isEnabled(), 
	                "Balconies filter is not enabled.");

	        

			break;
		}
		Reporter.log(checkmark + "is selected", true);
	}
	   
	}

