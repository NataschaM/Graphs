package de.nata.graphs.logging;

import org.apache.log4j.Logger;

public class GraphsLogger {
	
	final static Logger logger = Logger.getLogger(GraphsLogger.class);
	
	public void logInfo(String info) {
		logger.info(info);
	}

}
