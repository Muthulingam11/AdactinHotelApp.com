package com.adactinhotelappCucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
//import com.adactin.AdactinBase_class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import com.adactinhotelapp.AdactinBase_class;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\Adactin\\feature",
glue="classpath:com.Adactincucumber",
dryRun= false,publish=true, monochrome = true,
plugin= {
		"html:target/cucumber-reports.html",
		"pretty",
		"json:target/cucumberjunitreport.json"
})

public class AdactincucumberRunner {

	public static WebDriver driver1;

	@BeforeClass
	public static void set_up() throws Throwable {
		Thread.sleep(1000);
		driver1 = AdactinBase_class.getbrowser("chrome");
	}

	@AfterClass
	public static void tear_down() {
		driver1.close();
	}
}
