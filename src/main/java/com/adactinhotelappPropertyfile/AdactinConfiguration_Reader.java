package com.adactinhotelappPropertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class AdactinConfiguration_Reader {
	
	public static Properties prof;

	public AdactinConfiguration_Reader() throws Throwable {
		File f = new File("C:\\Users\\Muthu\\eclipse-workspace\\adactinhotelapp.com\\Adactinprperty.properties");
		FileInputStream fis = new FileInputStream(f);
		prof=new Properties();
		prof.load(fis);
	}

	public String geturl() throws Throwable{
		String url = prof.getProperty("url");
		return url;
	}

	public String getusername() {
		String username = prof.getProperty("username");
		return username;
	}

	public String getpassword() {
		String password = prof.getProperty("password");
		return password;
	}

	public String getdatein() {
		String datein = prof.getProperty("datein");
		return datein;
	}

	public String getdateout() {
		String dateout = prof.getProperty("dateout");
		return dateout;
	}

	public String getfirstname() {
		String firstname = prof.getProperty("firstname");
		return firstname;
	}

	public String getlastname() {
		String lastname = prof.getProperty("lastname");
		return lastname;
	}

	public String getaddress() {
		String address = prof.getProperty("address");
		return address;
	}

	public String getcc() {
		String cc = prof.getProperty("cc");
		return cc;
	}

	public String getcvv() {
		String cvv = prof.getProperty("cvv");
		return cvv;
	}
}
