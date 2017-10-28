package com.veklib.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.veklib.springboot.dao")
public class VekSpringBootApp {
	public static void main(String[] args) {
		SpringApplication.run(VekSpringBootApp.class,args);
	}
}
