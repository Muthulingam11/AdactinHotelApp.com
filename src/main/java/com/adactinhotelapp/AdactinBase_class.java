package com.adactinhotelapp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinBase_class {
	
	public static WebDriver dri; 

	public static WebDriver getbrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
			dri = new ChromeDriver();	
		} else if(type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			dri = new FirefoxDriver();
		}

		dri.manage().window().maximize();
		return dri;	
	}

	public static void geturl(String url) {
		dri.get(url);
	}

	public static void clickelement(WebElement element) {
		element.click();
	}

	public static void sendvalues(WebElement element, String values) {
		element.sendKeys(values);
	}

	/*
	 * public static void wait(int longtime) {
	 * dri.manage().timeouts().implicitlyWait(longtime, TimeUnit.SECONDS); }
	 */
	
	public static void wait(int longtime) {
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(longtime));
	}

	public static void selection(WebElement element,String dropdown,String value,String index,String text) {
		Select s = new Select(element);
		if (dropdown.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if(dropdown.equalsIgnoreCase("index")){
			int inti = Integer.parseInt(index);
			s.selectByIndex(inti);
		} else if(dropdown.equalsIgnoreCase("visibletest")) {
			s.selectByVisibleText(text);
		} else if(dropdown.equalsIgnoreCase("deselectvalue")) {
			s.deselectByValue(value);
		} else if(dropdown.equalsIgnoreCase("deselectindex")) {
			int int1 = Integer.parseInt(index);
			s.deselectByIndex(int1);
		}
	}	

	public static void selection1 (WebElement element, String visibletext) {
		Select s1 = new Select(element);
		s1.selectByVisibleText(visibletext);
	}

	/*
	 * public static void selection2 (WebElement element, String index) { Select s2
	 * = new Select(element); int parseint = Integer.parseInt(index);
	 * s2.selectByIndex(parseint); } public static void selection3 (WebElement
	 * element, String value) { Select s3 = new Select(element); int parseint1 =
	 * Integer.parseInt(value);
	 * 
	 * s3.selectByValue(parseint1); }
	 */

	public static void threadsleep(int millisec) throws Throwable {
		Thread.sleep(millisec);
	}
}
