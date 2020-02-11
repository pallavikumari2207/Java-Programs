package com.blz.logical;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.blz.basic.LogUtility;
import com.blz.log.Customizedexception;
import com.blz.utils.InputUtility;
import com.blz.utils.logical.UtilsLogical;

public class Gambler {
	public static void main(String[] args) {
		LogUtility.setlog("Distance");
		Logger logger=LogUtility.getLog();
		System.setProperty("fname","/home/admin1/eclipse-workspace/basic program/src/main/java/com/blz.log");
		String log4jConfigFile="/home/admin1/eclipse-workspace/basicPrograms/log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		LogUtility.logger.warn("Can cause InputMismatchException");
		System.out.println("enter stake");
		InputUtility val = new InputUtility();
		int stake =val.intval();
		System.out.println("enter goal");
		int goal=val.intval();
		System.out.println("enter trials");
		int trials=val.intval();
		System.out.println("enter bets");
		int bets=val.intval();
		try {
		int wins=UtilsLogical.gambler(trials, stake, goal,bets);	
		System.out.println(wins +" win count");
		}
		catch(Customizedexception IME) {
			logger.error(IME);	
		}
	}

}
