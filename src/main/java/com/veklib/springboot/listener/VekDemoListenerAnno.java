/**
 * 
 */
package com.veklib.springboot.listener;

import java.util.Iterator;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

/**
 * 
 * @author	veklia
 * @since	version
 * @see		
 */
@WebListener("vekDemoListenerAnno")
public class VekDemoListenerAnno implements ServletContextListener {
	private Logger logger = Logger.getLogger(VekDemoListenerAnno.class);

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		logger.info("======== @VekDemoListenerAnno.contextInitialized");
		logger.info("===== service is " + sce.getServletContext().getServerInfo());
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		logger.info("==================== @VekDemoListenerAnno.contextDestroyed");
	}

}
