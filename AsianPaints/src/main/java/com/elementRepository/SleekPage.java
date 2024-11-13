package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SleekPage {
	public SleekPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Book consultation' and @class='btn btn__icon--right btn--primary popup-btn']")
	private WebElement bookConsultation ;

	@FindBy(id="field_full_name")
	private WebElement fullName ;

  @FindBy(id="field_login_add_phone_number")
	private WebElement phoneNumber  ;
	
  @FindBy(id="form-field__pincode")
	private WebElement pincode ;
	
	@FindBy(id="field_email")
	private WebElement email ;
	
	@FindBy(id="btn-save-personal-details")
	private WebElement submit ;
	
	@FindBy(xpath="//img[@title='sleek-kitchens']")
	private WebElement sleekKitchens ;
	
	@FindBy(xpath="//img[@alt='check']")
	private WebElement thankYou ;
	
	public WebElement getBookConsultation() {
		return bookConsultation;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSleekKitchens() {
		return sleekKitchens;
	}

	public WebElement getThankYou() {
		return thankYou;
	}
	public void clickMethodForSleekPage(WebElement element) {
		element.click();
	}
	
	
}
