package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy(id="transfer_funds_link")
	private WebElement tranfFunds;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickTransferFunds() {
		tranfFunds.click();
	}
	
	public boolean isTransferFundsLinkPresent() {
		return tranfFunds.isDisplayed();
	}

}
