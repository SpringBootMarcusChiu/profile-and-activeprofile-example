package com.marcuschiu.profileandactiveprofileexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ProfileAndActiveProfileExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProfileAndActiveProfileExampleApplication.class, args);
	}

	@Autowired
	PojoBean pojoBean;

	@Autowired
	Environment environment;

	@Override
	public void run(String... args) {
		System.out.println("PojoBean name: " + pojoBean.name);

		for (String profileName : environment.getActiveProfiles()) {
			System.out.println("Currently active profile - " + profileName);
		}
	}

}
