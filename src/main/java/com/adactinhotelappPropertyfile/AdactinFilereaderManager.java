package com.adactinhotelappPropertyfile;

public class AdactinFilereaderManager {

	private AdactinFilereaderManager() {

	}

	public static AdactinFilereaderManager getInstanceFRM() {
		AdactinFilereaderManager frm = new AdactinFilereaderManager();
		return frm;	
	}

	public AdactinConfiguration_Reader getInstanceCR() throws Throwable {
		AdactinConfiguration_Reader reader = new AdactinConfiguration_Reader();
		return reader;	
	}
}
