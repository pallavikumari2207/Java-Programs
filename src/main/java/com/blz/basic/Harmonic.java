package com.blz.basic;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.blz.log.Customizedexception;
import com.blz.util.Util;
import com.blz.utility.InputUtility;

public class Harmonic {
	public static void main(String [] args)
	{
		LogUtility.setlog("FlipCoin");
		Logger logger=LogUtility.getLog();
		System.setProperty("fname","/home/admin1/eclipse-workspace/basic program/src/main/java/com/blz/basic.log");
		String log4jConfigFile="/home/admin1/eclipse-workspace/basicPrograms/log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		int n = InputUtility.intval();
		LogUtility.logger.info("Logger Name:"+ LogUtility.logger.getName());
		LogUtility.logger.warn("Can cause InputMismatchException");
		try
		{
		float result=Util.harmonic(n);
		System.out.println(result);
		}
		catch(Customizedexception IME)
		{

	    	logger.error(IME);
		}
		
	}

}
