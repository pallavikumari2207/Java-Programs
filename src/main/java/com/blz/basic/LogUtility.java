package com.blz.basic;

import org.apache.log4j.Logger;

public class LogUtility {
	static Logger logger;

	public static Logger getLog() {
		return logger;
	}

	public static void setlog(String programname) {
		logger = logger.getLogger(programname);
	}
}
