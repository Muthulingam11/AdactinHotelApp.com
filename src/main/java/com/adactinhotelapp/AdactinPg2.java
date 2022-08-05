package com.adactinhotelapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPg2 {
	
	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public AdactinPg2(WebDriver dri2) {
		this.driver = dri2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continuesubmit;

	public WebElement getContinuesubmit() {
		return continuesubmit;
	}
}
