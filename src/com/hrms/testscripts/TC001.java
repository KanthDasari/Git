package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.General;

public class TC001 {
		//public static void main(String args[]) {
			public void tc001() {
				DOMConfigurator.configure("log4j.xml");
				General obj = new General();
				obj.openApplication();
				obj.login();
				obj.enterFrame();
				obj.addNewEmp();
				obj.exitFrame();
				obj.logout();
				obj.closeApplication();
					
			
		}
		
		
	

}
