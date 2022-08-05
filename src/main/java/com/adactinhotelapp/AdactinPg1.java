package com.adactinhotelapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPg1 {
	
	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public AdactinPg1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;

	public WebElement getRoomtype() {
		return roomtype;
	}

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement no_of_room;

	public WebElement getNo_of_room() {
		return no_of_room;
	}

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement datein;

	public WebElement getDatein() {
		return datein;
	}

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement dateout;

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult_per_room() {
		return adult_per_room;
	}

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult_per_room;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child_room;

	public WebElement getChild_room() {
		return child_room;
	}

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitpg1;

	public WebElement getSubmitpg1() {
		return submitpg1;
	}
}
