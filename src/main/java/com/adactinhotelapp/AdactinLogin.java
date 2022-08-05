package com.adactinhotelapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin {
	
	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public AdactinLogin(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@id='username'])[1]")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}

	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
}
