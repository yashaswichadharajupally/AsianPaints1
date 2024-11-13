package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DecorPage {
	public DecorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@aria-label='decor-pro']")
	private WebElement decorPro ;
	
	@FindBy(xpath="//div[@class='colorProNavBar']//a[text()=' About DecorPro']")
	private WebElement aboutDecorPro ;

	@FindBy(xpath="//a[text()='DecorPro by Asian Paints']")
	private WebElement decoproByAsian ;

	@FindBy(xpath="//img[@alt='logo']")
	private WebElement aboutDecor ;
	
	@FindBy(xpath="(//a[ contains(text(),'X')])[1]")
	private WebElement popBet ;
	
	@FindBy(xpath="(//a[ contains(text(),'X')])[1]")
	private WebElement handleFormPop ;
	
	@FindBy(xpath="(//button[@aria-label='Close'])[3]")
	private WebElement waterproofPopup ;
	
	

    public WebElement getHandleFormPop() {
		return handleFormPop;
	}

	public WebElement getDecorPro() {
		return decorPro;
	}

    public WebElement getAboutDecorPro() {
		return aboutDecorPro;
	}

   public WebElement getDecoproByAsian() {
		return decoproByAsian;
	}

  public WebElement getAboutDecor() {
		return aboutDecor;
	}

public WebElement getPopBet() {
	return popBet;
}

public WebElement getWaterproofPopup() {
	return waterproofPopup;
}


  
	
	
	
	
	
	
	
	
}
