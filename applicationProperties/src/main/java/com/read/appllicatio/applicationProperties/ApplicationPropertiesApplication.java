package com.read.appllicatio.applicationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ApplicationPropertiesApplication implements CommandLineRunner{

	@Autowired
	private Environment environment;

	@Value("${fullname}")
	private String name;


	@Value("${lastname}")
	private String lastname;

	@Value("${app.name}")
	private String appname;


	//When you want to execute some piece of code exactly before the application startup completes

	@Override
	public void run(String... args) throws Exception {

		System.out.println(environment.getProperty("fullname") +' '+ environment.getProperty("lastname"));
		System.out.println(environment.getProperty("app.name"));
		System.out.println(name);
		System.out.println(lastname);
		System.out.println(appname);
	}

	public static void main(String[] args) {
		SpringApplication.run(ApplicationPropertiesApplication.class, args);


	}
}
