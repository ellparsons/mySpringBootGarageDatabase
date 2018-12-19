package com.parsons.elliott.garageDatabase.mySpringBootGarageDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MySpringBootGarageDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootGarageDatabaseApplication.class, args);
	}
}
