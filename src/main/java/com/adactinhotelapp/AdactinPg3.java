package com.adactinhotelapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPg3 {
	
	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public AdactinPg3(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccpay;

	public WebElement getCcpay() {
		return ccpay;
	}

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cctype;

	public WebElement getCctype() {
		return cctype;
	}

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement ccexpmonth;

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement ccexpyear;

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cccvv;

	public WebElement getCccvv() {
		return cccvv;
	}

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}
}
