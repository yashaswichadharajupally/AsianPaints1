package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UltraPage {
	public UltraPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//div[text()='Ultra Block 2k']")
	private WebElement ultrablock ;


	@FindBy(xpath="//h2[@class='palleteTitle ']")
	private WebElement ultraHeader ;


	public WebElement getUltrablock() {
		return ultrablock;
	}


	public WebElement getUltraHeader() {
		return ultraHeader;
	}


}
