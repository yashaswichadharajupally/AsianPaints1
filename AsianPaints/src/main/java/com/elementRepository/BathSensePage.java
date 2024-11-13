package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BathSensePage {
	public BathSensePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[contains(text(),'Get Directions')])[4]")
	private WebElement  directions;
	
	@FindBy(xpath="//a[@class='divisioncards' and @aria-label='bathsense']")
	private WebElement  bathsense;
	
	@FindBy(xpath="//span[text()='Floor Mounted Vanities']")
	private WebElement  floorMounted;
	
	@FindBy(xpath="//a[text()='Go to homepage']")
	private WebElement homePage ;
	
	@FindBy(xpath="//h2[text()='TREAT YOUR SENSES TO INSPIRING DESIGNS']")
	private WebElement inspringDesigns ;
	

	@FindBy(xpath="(//a[text()='Our Collections'])[4]")
	private WebElement collections ;
	
	@FindBy(xpath="(//a[ contains(text(),'X')])[1]")
	private WebElement handleFormPops ;
	
	public WebElement getHandleFormPops() {
		return handleFormPops;
	}

	public WebElement getWaterproofPopups() {
		return waterproofPopups;
	}
	@FindBy(xpath="(//button[@aria-label='Close'])[3]")
	private WebElement waterproofPopups ;
	

	public WebElement getDirections() {  
		return directions;
	}

	public WebElement getBathsense() {
		return bathsense;
	}

	public WebElement getFloorMounted() {
		return floorMounted;
	}

	public WebElement getHomePage() {
		return homePage;
	}

	public WebElement getInspringDesigns() {
		return inspringDesigns;
	}
	public WebElement getCollections() {
		return collections;
	}
	public void clickMethodForBathSensePage(WebElement element) {
		element.click();
	}
	
	@FindBy(xpath="//div[text()='Our Divisions']")
	private WebElement ourDivisions ;

	public WebElement getOurDivisions() {
		return ourDivisions;
	}

	@FindBy(xpath="//h3[text()='Discover Our Offerings']")
	private WebElement faucetFittings ;

	public WebElement getFaucetFittings() {
		return faucetFittings;
	}
	

	
}

