package com.blz.basic;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.blz.log.Customizedexception;
import com.blz.utils.InputUtility;
import com.blz.utils.Util;

public class LeapYear {
	public static void main(String[] args) {
		LogUtility.setlog("LeapYear ");
		Logger logger = LogUtility.getLog();
		System.setProperty("fname", "/home/admin1/eclipse-workspace/basic program/src/main/java/com/blz/basic.log");
		String log4jConfigFile = "/home/admin1/eclipse-workspace/basic program/Log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("enter year:");
		InputUtility val = new InputUtility();
		int year = val.intval();
		Util method = new Util();
		try {
			boolean isleap = Util.leapyr(year);
			if (isleap == true)
				System.out.println("it is a leapyear");
			else
				System.out.println("regular year");
		} catch (Customizedexception IME) {
			logger.error(IME);
		}

	}

}
