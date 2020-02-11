package com.blz.logical;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.blz.basic.LogUtility;
import com.blz.log.Customizedexception;
import com.blz.utils.InputUtility;
import com.blz.utils.logical.UtilsLogical;


public class stopWatch {
	long startTimer=0;
	long stopTimer=0;
	long elapsed;
	public static void main(String[] args) {
		LogUtility.setlog("stopWatch");
		Logger logger=LogUtility.getLog();
		System.setProperty("fname","/home/admin1/eclipse-workspace/basic program/src/main/java/com/blz/logical.log");
		String log4jConfigFile="/home/admin1/eclipse-workspace/basicPrograms/log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		LogUtility.logger.info("Logger Name:"+ LogUtility.logger.getName());
		LogUtility.logger.warn("Can cause InputMismatchException");
		long startTimer=0;
		long stopTimer=0;
		long elapsed = 0;
		stopWatch sw=new stopWatch();
	    System.out.println("Press '1' to Start Time: ");
	    int start = InputUtility.intval();
		sw.start();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		int stop = InputUtility.intval();
		 sw.stop();
		 try
		 {
		 long l=UtilsLogical.getElapsedTime(start,stop, elapsed);
			System.out.println();
			System.out.println("Total Time Elapsed(in millisec) is:"+l);
			System.out.println();
			System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
		 }
		 catch(Customizedexception IME)
		    {
		    	logger.error(IME);
		    }
	}
		public void start()
		{ 
			startTimer=System.currentTimeMillis();
			System.out.println("Start Time is: "+startTimer);
		}
		public void stop()
		{
			stopTimer=System.currentTimeMillis();
			System.out.println("Stop Time is: "+stopTimer);
		}
		
	}


