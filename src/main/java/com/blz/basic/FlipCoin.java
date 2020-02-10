package com.blz.basic;

import java.util.InputMismatchException;
import java.util.Random;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.blz.log.Customizedexception;
import com.blz.utils.InputUtility;
import com.blz.utils.Util;

public class FlipCoin {
	public static void main(String[] args) {
		LogUtility.setlog("FlipCoin");
		Logger logger=LogUtility.getLog();
		System.setProperty("fname","/home/admin1/eclipse-workspace/StringReplace/src/main/java/com/blz/basic.log");
		String log4jConfigFile="/home/admin1/eclipse-workspace/basicPrograms/log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		System.out.println("enter number of times to flip coin");
		try {
		int n = InputUtility.intval();
			LogUtility.logger.info("Logger Name:"+ LogUtility.logger.getName());
			LogUtility.logger.warn("Can cause InputMismatchException");
			Random rand = new Random();
			Util method=new Util();
			int head_percent=Util.flipcoin(n);
			System.out.println(head_percent);
		}

	    catch(Customizedexception IME)
	    {
	    	logger.error(IME);
	    }
	}}

//	public static int prcent(int n) {
//		int headcount = 0;
//		int tailcount = 0;
//		// System.out.println(x);
//		for (int i = 0; i < n; i++) {
//			Random rand = new Random();
//			float x = rand.nextFloat();
//			System.out.println(x);
//			if (x < 0.5) {
//				headcount++;
//			} else {
//				tailcount++;
//			}
//		}
//		System.out.println(headcount);
//		System.out.println(tailcount);
//		float percent_head = (((float) (headcount) / (float) n) * 100);
//		System.out.println(percent_head);
//		float percent_tail = (((float) (tailcount) / (float) n) * 100);
//		System.out.println(percent_tail);
//		return (int) percent_head;
//	}
//}
