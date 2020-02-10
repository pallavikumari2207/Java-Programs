package com.blz.basic;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.blz.log.Customizedexception;
import com.blz.utils.Util;

public class PowerOf2 {
	public static void main(String[] args) {
		LogUtility.setlog("PowerOf2");
		Logger logger=LogUtility.getLog();
		System.setProperty("fname","/home/admin1/eclipse-workspace/basic program/src/main/java/com/blz.log");
		String log4jConfigFile="/home/admin1/eclipse-workspace/basicPrograms/log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
			LogUtility.logger.info("Logger Name:");
			LogUtility.logger.warn("Can cause InputMismatchException");
			int num = Integer.parseInt(args[0]);
			System.out.println(num);
		      try { 
			int[] disp=Util.powerfunc(num);
			for(int num1 : disp)
				System.out.print(num1+" ");
			}
				
			catch(Customizedexception IME)
			{
				logger.error(IME);
			}}
			 }

