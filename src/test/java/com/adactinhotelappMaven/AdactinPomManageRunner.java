package com.adactinhotelappMaven;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import com.adactin.AdactinBase_class;
//import com.adactin.AdactinPommanage;
//import adactinpropertyfile.AdactinFilereaderManager;
//import propertyfile.File_Reader_Manager;
import com.adactinhotelapp.AdactinBase_class;
import com.adactinhotelapp.AdactinPommanage;
import com.adactinhotelappPropertyfile.AdactinFilereaderManager;


public class AdactinPomManageRunner extends AdactinBase_class {
	
	public static WebDriver driver = getbrowser("chrome");
	public static AdactinPommanage adactinpom = new AdactinPommanage(driver);
	static Logger log = Logger.getLogger(AdactinPomManageRunner.class);

	public static void main(String[] args) throws Throwable {
		BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
		wait(10);
		String url = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().geturl();
		geturl(url);
		log.info("Browser Launced");
		String username = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getusername();
		sendvalues(adactinpom.getInstancelg().getUsername(), username);
		String password = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getpassword();
		sendvalues(adactinpom.getInstancelg().getPass(), password);
		clickelement(adactinpom.getInstancelg().getLogin());
		log.info("Logined successfully");
		selection1(adactinpom.getInstancepg1().getLocation(), "New York" );
		selection1(adactinpom.getInstancepg1().getHotels(), "Hotel Sunshine" );
		selection1(adactinpom.getInstancepg1().getRoomtype(), "Standard" );
		selection1(adactinpom.getInstancepg1().getNo_of_room(), "1 - One");
		String datein = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getdatein();
		sendvalues(adactinpom.getInstancepg1().getDatein(), datein);
		String dateout = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getdateout();
		sendvalues(adactinpom.getInstancepg1().getDateout(),dateout);
		selection1(adactinpom.getInstancepg1().getAdult_per_room(), "1 - One");
		selection1(adactinpom.getInstancepg1().getChild_room(), "0 - None");
		clickelement(adactinpom.getInstancepg1().getSubmitpg1());
		clickelement(adactinpom.getInstancepg2().getRadiobutton());
		clickelement(adactinpom.getInstancepg2().getContinuesubmit());
		String firstname = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getfirstname();
		sendvalues(adactinpom.getInstancepg3().getFirstname(), firstname);
		String lastname = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getlastname();
		sendvalues(adactinpom.getInstancepg3().getLastname(), lastname);
		String address = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getaddress();
		sendvalues(adactinpom.getInstancepg3().getAddress(), address);
		String cc = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getcc();
		sendvalues(adactinpom.getInstancepg3().getCcpay(), cc);
		selection1(adactinpom.getInstancepg3().getCctype(), "American Express");
		selection1(adactinpom.getInstancepg3().getCcexpmonth(), "May");
		selection1(adactinpom.getInstancepg3().getCcexpyear(), "2022");
		String cvv = AdactinFilereaderManager.getInstanceFRM().getInstanceCR().getcvv();
		sendvalues(adactinpom.getInstancepg3().getCccvv(), cvv);
		clickelement(adactinpom.getInstancepg3().getBooknow());
		clickelement(adactinpom.getInstancePg4().getMyitinerary());
		clickelement(adactinpom.getInstancePg4().getLogout());
		log.info("Room booked");	
	}
}
