package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@class='before-login'and @alt='profile-button']")
	private WebElement loginLogo;


	

	@FindBy(id = "phoneInput")
	private WebElement phoneNumberFeild;

	

	@FindBy(id = "phoneSubmit")
	private WebElement proceedButton;



	@FindBy(id = "nameInput")
	private WebElement nameField;

	

	@FindBy(id = "emailInput")
	private WebElement emailField;

	

	@FindBy(xpath = "(//input[@name='profile.zip'])[2]")
	private WebElement pincodeField;

	

	@FindBy(id = "registrationSubmit")
	private WebElement registrationButton;

	

	@FindBy(id = "gigya-checkbox-4232687272998768")
	private WebElement checkboxField;

	

	@FindBy(xpath = "//div[@class='cta animated-btn-black round-corner-radius-button gigya-profile-logout-button']")
	private WebElement logout;



	public WebElement getLoginLogo() {
		return loginLogo;
	}



	public WebElement getPhoneNumberFeild() {
		return phoneNumberFeild;
	}



	public WebElement getProceedButton() {
		return proceedButton;
	}



	public WebElement getNameField() {
		return nameField;
	}



	public WebElement getEmailField() {
		return emailField;
	}



	public WebElement getPincodeField() {
		return pincodeField;
	}



	public WebElement getRegistrationButton() {
		return registrationButton;
	}



	public WebElement getCheckboxField() {
		return checkboxField;
	}



	public WebElement getLogout() {
		return logout;
	}

	
}

