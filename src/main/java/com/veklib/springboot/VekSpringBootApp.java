package com.veklib.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages={"com.veklib.springboot"},exclude = {})
//Servlet启动扫描：扫描工程中的Servlet、Filter、Listener
@ServletComponentScan(basePackages = {"com.veklib.springboot"})
@MapperScan("com.veklib.springboot.dao")
public class VekSpringBootApp {
	public static void main(String[] args) {
		SpringApplication.run(VekSpringBootApp.class,args);
	}
}
