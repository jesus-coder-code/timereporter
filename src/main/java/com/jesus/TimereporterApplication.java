package com.jesus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//SpringBootServletInitializer
@EntityScan("com.jesus.models")

@ComponentScan("com.jesus.security.jwt")
@EnableJpaRepositories("com.jesus.security.repository")
@EnableTransactionManagement
@SpringBootApplication
public class TimereporterApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TimereporterApplication.class, args);
	}

}
