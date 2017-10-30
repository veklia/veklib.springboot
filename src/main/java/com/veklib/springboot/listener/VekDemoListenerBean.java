/**
 * 
 */
package com.veklib.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

/**
 * 
 * @author	veklia
 * @since	version
 * @see		
 */
public class VekDemoListenerBean implements ServletContextListener {
	private Logger logger = Logger.getLogger(VekDemoListenerBean.class);

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		logger.info("==================== @VekDemoListenerBean.contextInitialized");
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		logger.info("==================== @VekDemoListenerBean.contextDestroyed");
	}

}
