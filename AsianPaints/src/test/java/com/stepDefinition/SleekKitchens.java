package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.Homepage;
import com.elementRepository.SleekPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SleekKitchens {
	WebDriver driver = DriverFactory.getDriver();
	SleekPage sleekPage = new SleekPage(driver);
	WebDriverUtility utility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
//	JavascriptExecutor js=(JavascriptExecutor)driver;

	@When("scroll down and click on  sleek kitchens")
	public void scroll_down_and_click_on_sleek_kitchens() throws Exception {
		WebElement bat=driver.findElement(By.xpath("//div[text()='Our Divisions']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", bat);
		sleekPage.clickMethodForSleekPage(sleekPage.getSleekKitchens());
		
	   //sleekPage.getSleekKitchens().click();
	   utility.switchToTabOnTitle(driver, fileUtility.getDataFromPropertiesFiles("sleekKitchensTitle"));
   Assert.assertEquals(driver.getTitle(), fileUtility.getDataFromPropertiesFiles("sleekKitchensTitle"));
	   Reporter.log("User should navigate to Sleek Kitchens page", true);
	}

	@When("Click on book consultation")
	public void click_on_book_consultation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		utility.javascriptClick(driver, sleekPage.getBookConsultation());
		Thread.sleep(2000);	
		 Reporter.log("User clicked on book consultation", true);
	}

	@When("enter the valid credentials")
	public void enter_the_valid_credentials() throws Exception {
		String name = fileUtility.getDataFromPropertiesFiles("name");
		String phoneno=fileUtility.getDataFromPropertiesFiles("phonenumber");
		String pincode=fileUtility.getDataFromPropertiesFiles("pincode");
		String email= fileUtility.getDataFromPropertiesFiles("email");
		
		    sleekPage.getFullName().sendKeys(name);
		    sleekPage.getPhoneNumber().sendKeys(phoneno);
		    sleekPage.getPincode().sendKeys(pincode);
		    sleekPage.getEmail().sendKeys(email);
		    Reporter.log("User entered valid credentials", true);
	}

	@When("click on sumbit")
	public void click_on_sumbit() {
		sleekPage.clickMethodForSleekPage(sleekPage.getSubmit());
		//ssleekPage.getSubmit().click();
		 Reporter.log("User clicked on submit", true);
	}

	@Then("verify consultation is booked or not")
	public void verify_consultation_is_booked_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 sleekPage.getThankYou().isDisplayed();
		 Reporter.log("User should see Thank You note ", true);
	         
	}

}
