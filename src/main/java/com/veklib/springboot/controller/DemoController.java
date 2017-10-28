package com.veklib.springboot.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.veklib.springboot.bean.Demo;
import com.veklib.springboot.dao.DemoMapper;

@RestController
@EnableAutoConfiguration
@RequestMapping("/demo")
public class DemoController {
	private static Logger logger = Logger.getLogger(DemoController.class);
	@Autowired
	DemoMapper demoDao;
	
	@RequestMapping("/info/{id}")
	public String insertData(@PathVariable Integer id){
		logger.info("search for id = " + id);
		Demo demo = demoDao.selectByPrimaryKey(id);
		return JSONObject.toJSONString(demo);
	}
	
}
