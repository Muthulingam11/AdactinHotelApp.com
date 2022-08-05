package com.adactinhotelapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPg4 {
	
	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public AdactinPg4(WebDriver dri2) {
		this.driver = dri2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement myitinerary;

	public WebElement getMyitinerary() {
		return myitinerary;
	}

	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
}
