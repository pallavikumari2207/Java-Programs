package com.blz.basic;

import java.util.InputMismatchException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.blz.log.Customizedexception;
import com.blz.utils.InputUtility;
import com.blz.utils.Util;

public class StringReplace {
	public static void main(String[] args) {
		LogUtility.setlog("StringReplace");
		Logger logger=LogUtility.getLog();
		System.setProperty("fname","/home/admin1/eclipse-workspace/StringReplace/src/main/java/com/blz/basic.log");
		String log4jConfigFile="/home/admin1/eclipse-workspace/basicPrograms/log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
			LogUtility.logger.info("Logger Name:");
			LogUtility.logger.warn("Can cause InputMismatchException");
		System.out.println("enter your full name");
		InputUtility val=new InputUtility();
		String name=InputUtility.stringval();
	   try { 
	    	Util method=new Util();
		String disp=Util.sringreplace(name);
		System.out.println(disp);
	    
	    }
	    catch(Customizedexception IME)
	    {
	    	logger.error(IME);
	    }
	}

}

