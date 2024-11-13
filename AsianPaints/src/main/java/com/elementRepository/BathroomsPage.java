package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BathroomsPage {
	public BathroomsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[@class='mob-extra-bold-16']")
	private WebElement  bathroomsproducts;

	@FindBy(xpath="//label[span[@class='label-name' and text()='economy']]//span[@class='checkmark']")
	private WebElement  economyfilter;
	
	@FindBy(xpath="//label[span[@class='label-name' and text()='balconies']]//span[@class='checkmark']")
	private WebElement Balconiesfilter ;

	public WebElement getEconomyfilter() {
		return economyfilter;
	}
	public WebElement getBalconiesfilter() {
		return Balconiesfilter;
	}
	public WebElement getBathroomsproducts() {
		return bathroomsproducts;
	}
	public void clickMethodForBathRoomsPage(WebElement element) {
		element.click();
	}

}



	



	

	
	
	
	





