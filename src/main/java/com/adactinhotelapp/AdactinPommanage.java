package com.adactinhotelapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import Maven.test.Page1;

public class AdactinPommanage {
	
	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public AdactinPommanage (WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	private AdactinLogin lg;
	private AdactinPg1 pg1;
	private AdactinPg2 pg2;
	private AdactinPg3 pg3;
	private AdactinPg4 pg4;

	public AdactinLogin getInstancelg() {
		if(lg==null) {
			lg = new AdactinLogin(driver); 
		}
		return lg;
	}

	public AdactinPg1 getInstancepg1() {
		if(pg1==null) {
			pg1 = new AdactinPg1(driver); 
		}
		return pg1;
	}

	public AdactinPg2 getInstancepg2() {
		if(pg2==null) {
			pg2 = new AdactinPg2(driver); 
		}
		return pg2;
	}
	public AdactinPg3 getInstancepg3() {
		if(pg3==null) {
			pg3 = new AdactinPg3(driver); 
		}
		return pg3;
	}

	public AdactinPg4 getInstancePg4() {
		if(pg4==null) {
			pg4 = new AdactinPg4(driver); 
		}
		return pg4;
	}
}
