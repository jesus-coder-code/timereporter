package com.jesus;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
@EnableTransactionManagement
public class TimereporterApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TimereporterApplication.class, args);
	}

}
