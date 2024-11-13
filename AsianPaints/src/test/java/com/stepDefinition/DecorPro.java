package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.DecorPage;
import com.elementRepository.Homepage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DecorPro {

	WebDriver driver = DriverFactory.getDriver();
	DecorPage decorPage= new DecorPage(driver);
	WebDriverUtility utility = new WebDriverUtility();
	Actions actions = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	@When("scroll down and click on  decor pro")
	public void scroll_down_and_click_on_decor_pro() throws InterruptedException {
		
//		utility.scrollToElementJS(driver, decorPage.getDecorPro());
		WebElement el=driver.findElement(By.xpath("//div[text()='Our Divisions']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", el);
		Thread.sleep(2000);
//		decorPage.getHandleFormPop().click();
		try {
	        WebElement formPopup = wait.until(ExpectedConditions.elementToBeClickable(decorPage.getHandleFormPop()));
	        formPopup.click();
	        System.out.println("Form pop-up closed successfully.");
	    } catch (Exception e) {
	        System.out.println("No form pop-up found: " + e.getMessage());
	    }
		 try {
		        wait.until(ExpectedConditions.elementToBeClickable(decorPage.getWaterproofPopup())).click();
		    } catch (TimeoutException e) {
		        System.err.println("No waterproof pop-up found or could not be clicked: " + e.getMessage());
		    }

		    // Click on the Decor Pro link
		    wait.until(ExpectedConditions.elementToBeClickable(decorPage.getDecorPro())).click();
		    Reporter.log("User clicked on Decor Pro", true);
		
//		wait.until(ExpectedConditions.elementToBeClickable(decorPage.getWaterproofPopup())).click();

//		decorPage.getDecorPro().click();
//	
//		Reporter.log("User clicked on Decor Pro", true);
		}

	@When("mouseHover on About DecorPro")
	public void mouse_hover_on_about_decor_pro() throws InterruptedException { 
		utility.switchToTabOnTitle(driver, "Premium Colours & Finishes for Architects & Interior Designers - DecorPro Asian Paints");
		actions.moveToElement(decorPage.getAboutDecorPro()).perform();
		Reporter.log("User hovered on About decorpro link", true);
	}

	
 @When("Click on Decor by asian paints") public void click_on_decor_by_asian_paints() { 
	  decorPage.getDecoproByAsian().click();
	Reporter.log("user clicked on Decor by asian paints",true);	  
	  }
	  
	  @Then("decorPro page should be displayed") public void decor_pro_page_should_be_displayed() { 
	        Assert.assertEquals(driver.getTitle(), "Asian Paints DecorPro - Service for Architects & Interior Designers");
	        Reporter.log("DecorPro page is displayed successfully", true);


	  }
}
