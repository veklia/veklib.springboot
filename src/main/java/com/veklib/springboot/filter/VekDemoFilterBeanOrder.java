/**
 * 
 */
package com.veklib.springboot.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

/**
 * SpringBoot Filter Demo.
 * @author	veklia
 * @see		
 */
public class VekDemoFilterBeanOrder implements Filter{
	private static Logger logger = Logger.getLogger(VekDemoFilterBeanOrder.class);
		
	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.info("~~~~~~~~~~~~~~VekDemoFilterBeanOrder . init");
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
//		HttpServletRequest 
		logger.info("~~~~~~~~~~~~~VekDemoFilterBeanOrder doFilter. URL = " + ((HttpServletRequest)request).getRequestURL());
		chain.doFilter(request, response);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		logger.info("~~~~~~~~~~~~~~~VekDemoFilterBeanOrder destroy." );
	}

}
