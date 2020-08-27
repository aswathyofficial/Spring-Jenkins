package com.JenkinApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinApplication {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinApplication.class);
	
	public void init()
	{
		logger.info("Application Statrted from inint");
	}

	public static void main(String[] args) {
		
		logger.info("Application executed from main");
		logger.info("Application executed from main @@@@@");
		SpringApplication.run(JenkinApplication.class, args);
	}

}
