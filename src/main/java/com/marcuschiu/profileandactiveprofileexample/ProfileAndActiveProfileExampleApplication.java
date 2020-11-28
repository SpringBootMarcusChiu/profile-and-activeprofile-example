package com.marcuschiu.profileandactiveprofileexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileAndActiveProfileExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProfileAndActiveProfileExampleApplication.class, args);
	}

	@Autowired
	PojoBean pojoBean;

	@Override
	public void run(String... args) {
		System.out.println(pojoBean.name);
	}
}
