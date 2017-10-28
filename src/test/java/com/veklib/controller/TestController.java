package com.veklib.controller;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TestController {
	public static Logger logger = Logger.getLogger(TestController.class);
	
	@RequestMapping("/login")
	String quickLogin(){
		System.out.println("spring boot: load login");
		return "{'result':1}";
	}
	@RequestMapping("/")
	String home(){
		System.out.println("spring boot: welcome");
		logger.info("===================user visit=============");
		return "welcome";
	}
	@RequestMapping("/welcome/{path}/{name}")
	String index(@PathVariable String path,@PathVariable String name){
		return "你好，"+name+",你正在访问"+path+"目录";
	}
	
}
