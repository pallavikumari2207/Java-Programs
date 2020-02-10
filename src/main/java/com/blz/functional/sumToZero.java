package com.blz.functional;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.blz.basic.LogUtility;
import com.blz.log.Customizedexception;
import com.blz.utils.InputUtility;
import com.blz.utils.Util;

public class sumToZero {
	public static void main(String[] args) {
	LogUtility.setlog("sumToZero");
	Logger logger = LogUtility.getLog();
	System.setProperty("fname", "/home/admin1/eclipse-workspace/basic program/src/main/java/com/blz.log");
	String log4jConfigFile = "/home/admin1/eclipse-workspace/basic program/Log4j.properties";
	PropertyConfigurator.configure(log4jConfigFile);
	logger.info("enter n:");
	InputUtility val = new InputUtility();
	int n =val.intval();
	int[]a = new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=val.intval();
	}
	boolean found = false;
	
	try {
	boolean flag=Util .findTriplets(a);
	if (flag == true) {
		System.out.println(" exsist");
	}
	else{
		System.out.println("not exisit");}
	}
	catch (Customizedexception IME) {
		logger.error(IME);
	}
	}	

}
