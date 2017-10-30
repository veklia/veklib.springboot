package com.veklib.springboot.config;

import org.apache.log4j.Logger;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.veklib.springboot.filter.VekDemoFilterBean;
import com.veklib.springboot.filter.VekDemoFilterBeanOrder;
import com.veklib.springboot.interceptor.VekDemoInterceptor;
import com.veklib.springboot.listener.VekDemoListenerBean;
import com.veklib.springboot.listener.VekDemoListenerOrder;

/**
 * 
 * @author	veklia
 * @since	version
 * @see		
 */
@Configuration
public class VekDemoWebConfig extends WebMvcConfigurerAdapter {
	private Logger logger = Logger.getLogger(VekDemoWebConfig.class);

	/*
	 * (non-Javadoc)
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry)
	 * 
	 * 添加自定义拦截器，并指定拦截路径。
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new VekDemoInterceptor()).addPathPatterns("/*");
//		registry.addInterceptor(new VekDemoInterceptor()).addPathPatterns("***");可设置多个PathPattern 
		logger.info("------------- VekInterceptorRegister.addInterceptors  ");
		super.addInterceptors(registry);
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry)
	 * 
	 * 注册静态文件的自定义映射路径
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/img/*").addResourceLocations("classpath:/img/");//resources目录下的img目录
		registry.addResourceHandler("/FPath/**").addResourceLocations("file:D:/protest/testImg/");//绝对磁盘路径
		logger.info("------------- VekInterceptorRegister.addInterceptors  ");
		super.addResourceHandlers(registry);
	}
	//-----------Filter Registration
	@Bean
	public FilterRegistrationBean vekDemoFilterBeanRegistrationBean() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new VekDemoFilterBean()); // 注入过滤器
		registration.addUrlPatterns("/*");	// 拦截规则
		registration.setName("vekDemoFilterBean");	// 过滤器名称
		registration.setOrder(2);	// 过滤器顺序
		
		return registration;
	}
	@Bean
	public FilterRegistrationBean vekDemoFilterBeanOrderRegistrationBean() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new VekDemoFilterBeanOrder());
		registration.addUrlPatterns("/*");
		registration.setName("vekDemoFilterBeanOrder");
		registration.setOrder(1);
		
		return registration;
	}
	//-----------Listener Registration
	@Bean
	public ServletListenerRegistrationBean<VekDemoListenerBean> vekDemoListenerRegistrationBean() {
		return new ServletListenerRegistrationBean<VekDemoListenerBean>(new VekDemoListenerBean());
	}
	@Bean
	public ServletListenerRegistrationBean<VekDemoListenerOrder> vekDemoListenerOrderRegistrationBean() {
		return new ServletListenerRegistrationBean<VekDemoListenerOrder>(new VekDemoListenerOrder());
	}
	
}
