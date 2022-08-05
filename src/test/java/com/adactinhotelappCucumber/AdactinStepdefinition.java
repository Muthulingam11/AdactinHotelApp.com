package com.adactinhotelappCucumber;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.adactinhotelapp.AdactinBase_class;
import com.adactinhotelapp.AdactinPommanage;
import com.adactinhotelappPropertyfile.AdactinFilereaderManager;

//import com.adactin.AdactinBase_class;
//import com.adactin.AdactinPommanage;
//import AdactinMaven.AdactinPomManageRunner;
//import Maven.test.Pommanage;
//import adactinpropertyfile.AdactinFilereaderManager;
import io.cucumber.core.backend.Status;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class AdactinStepdefinition extends AdactinBase_class {

	public static WebDriver driver=dri;
	public static AdactinPommanage adactinpom = new AdactinPommanage(driver);

	@io.cucumber.java.Before
	public void beforeHooks(Scenario Title) {
		String name =Title.getName();
		System.out.println("Scenario Name:"+name);
		System.out.println("Scenario Started");
	}

	@After
	private void afterHooks(Scenario Title) throws Throwable {
		if (Title.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) dri;
			java.io.File source = ts.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\Muthu\\eclipse-workspace\\Selenium\\Screenshots\\pic30.png");
			org.openqa.selenium.io.FileHandler.copy(source, destination);
		}
		io.cucumber.java.Status status =Title.getStatus();
		System.out.println("Status of scenario"+status);
	}

	@Given("User launch the site")
	public void user_launch_the_site() throws Throwable {
		wait(10);
		String url = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().geturl();
		geturl(url);
	}

	@When("User enter the username in username box")
	public void user_enter_the_username_in_username_box() throws Throwable {
		String username = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getusername();
		sendvalues(adactinpom.getInstancelg().getUsername(), username);
	}

	@When("User enter the Password in Password box")
	public void user_enter_the_password_in_password_box() throws Throwable {
		String password = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getpassword();
		sendvalues(adactinpom.getInstancelg().getPass(), password);
	}

	@Then("User click on the login button")
	public void user_click_on_the_login_button() {
		clickelement(adactinpom.getInstancelg().getLogin());
	}

	@When("User search the room by location")
	public void user_search_the_room_by_location() {
		selection1(adactinpom.getInstancepg1().getLocation(), "New York" );
	}

	@When("User search the hotel")
	public void user_search_the_hotel() {
		selection1(adactinpom.getInstancepg1().getHotels(), "Hotel Sunshine" );
	}

	@When("User choosing with roomtype")
	public void user_choosing_with_roomtype() {
		selection1(adactinpom.getInstancepg1().getRoomtype(), "Standard" );
	}

	@When("User choosing with no_of_room")
	public void user_choosing_with_no_of_room() {
		selection1(adactinpom.getInstancepg1().getNo_of_room(), "1 - One");
	}

	@When("User entering the checkin_date")
	public void user_entering_the_checkin_date() throws Throwable {
		String datein = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getdatein();
		sendvalues(adactinpom.getInstancepg1().getDatein(), datein);
	}

	@When("User entering the checkout_date")
	public void user_entering_the_checkout_date() throws Throwable {
		String dateout = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getdateout();
		sendvalues(adactinpom.getInstancepg1().getDateout(),dateout);
	}

	@When("User choosing room with no_of adults")
	public void user_choosing_room_with_no_of_adults() {
		selection1(adactinpom.getInstancepg1().getAdult_per_room(), "1 - One");
	}

	@When("User choosing room with no_of_child")
	public void user_choosing_room_with_no_of_child() {
		selection1(adactinpom.getInstancepg1().getChild_room(), "0 - None");
	}

	@Then("User submitting with search and page navigate to conforming")
	public void user_submitting_with_search_and_page_navigate_to_conforming() {
		clickelement(adactinpom.getInstancepg1().getSubmitpg1());
	}

	@When("User agree with the rooms")
	public void user_agree_with_the_rooms() {
		clickelement(adactinpom.getInstancepg2().getRadiobutton());
	}

	@Then("User continues with submit")
	public void user_continues_with_submit() {
		clickelement(adactinpom.getInstancepg2().getContinuesubmit());
	}

	@When("User entering the firstname")
	public void user_entering_the_firstname() throws Throwable {
		String firstname = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getfirstname();
		sendvalues(adactinpom.getInstancepg3().getFirstname(), firstname);
	}

	@When("User entering the lastname")
	public void user_entering_the_lastname() throws Throwable {
		String lastname = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getlastname();
		sendvalues(adactinpom.getInstancepg3().getLastname(), lastname);
	}

	@When("User entering the address")
	public void user_entering_the_address() throws Throwable {
		String address = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getaddress();
		sendvalues(adactinpom.getInstancepg3().getAddress(), address);
	}

	@When("User entering the cc_number")
	public void user_entering_the_cc_number() throws Throwable {
		String cc = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getcc();
		sendvalues(adactinpom.getInstancepg3().getCcpay(), cc);
	}

	@When("User choosing the cc_type")
	public void user_choosing_the_cc_type() {
		selection1(adactinpom.getInstancepg3().getCctype(), "American Express");
	}

	@When("User choosing the cc_exp_month")
	public void user_choosing_the_cc_exp_month() {
		selection1(adactinpom.getInstancepg3().getCcexpmonth(), "May");  
	}

	@When("User choosing the cc_exp_year")
	public void user_choosing_the_cc_exp_year() {
		selection1(adactinpom.getInstancepg3().getCcexpyear(), "2022");
	}

	@When("User entering the cc_cvv")
	public void user_entering_the_cc_cvv() throws Throwable {
		String cvv = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getcvv();
		sendvalues(adactinpom.getInstancepg3().getCccvv(), cvv);
	}

	@Then("User conforming the room")
	public void user_conforming_the_room() {
		clickelement(adactinpom.getInstancepg3().getBooknow());

	}

	@When("User seeing the booked room details")
	public void user_seeing_the_booked_room_details() {
		clickelement(adactinpom.getInstancePg4().getMyitinerary());  
	}

	@When("User logout")
	public void User_logout() {
		clickelement(adactinpom.getInstancePg4().getLogout());

	}
}
