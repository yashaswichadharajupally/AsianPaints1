package com.elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//iframe[@class='__st_preview_frame_bpn']")
	private WebElement  iframe;
	
	public WebElement getIframe() {
		return iframe;
	}
	
	@FindBy(name="notnow")
	private WebElement  popUp;

	public WebElement getPopUp() {
		return popUp;
	}

	@FindBy(xpath="//img[@title='close icon' and  @height='26']")
	private WebElement closeButton;

	public WebElement getCloseButton() {
		return closeButton;
	}

	@FindBy(xpath="//a[@data-target='#Waterproofing']")
		private WebElement  hoverOnWaterProofing;

		public WebElement getHoverOnWaterProofing() {
			return hoverOnWaterProofing;
		}

		@FindBy(xpath="//li[@aria-label='Bathrooms']")
		private WebElement  clickOnBathrooms;

		public WebElement getClickOnBathrooms() {
			return clickOnBathrooms;
		}
		public void Bathrooms(WebDriver driver) {
			driver.findElement(By.xpath("//a[@class='iconLinks iconLinks__close close_btn closeExitPopup']")).click();

		}


		@FindBy(xpath="//div[@class='title'][text()='Ultra Block 2k']")
		private WebElement productsDetails ;
		
		public WebElement getProductsDetails() {
			return productsDetails;
		}

		@FindBy(xpath="//h2[@class='palleteTitle '] ")
		private WebElement productsPage ;
		
		public WebElement getProductsPage() {
			return productsPage;
		}

//		
//		@FindBy(xpath="//img[@class='book-banner-popup_check']")
//		private WebElement check ;
//
//		public WebElement getCheck() {
//			return check;
//		}
		@FindBy(xpath="//img[@title='find-store-button']")
		private WebElement storeLoc ;

		public WebElement getStoreLoc() {
			return storeLoc;
		}
		@FindBy(xpath="//h2[text()='Store Locator']")
		private WebElement locationPage ;

		public WebElement getLocationPage() {
			return locationPage;
		}
		@FindBy(xpath="//img[@title='cart-button']")
		private WebElement addToCart ;

		public WebElement getAddToCart() {
			return addToCart;
		}
		@FindBy(xpath="//h4[@class='empty_cart_title']")
		private WebElement cartEmpty ;

		public WebElement getCartEmpty() {
			return cartEmpty;
		}
		public void clickMethodForWaterProofingPage(WebElement element) {
			element.click();
		}
		
	}




