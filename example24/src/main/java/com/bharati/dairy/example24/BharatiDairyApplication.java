package com.bharati.dairy.example24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.bharati.dairy.example24.repository")
@EntityScan("com.bharati.dairy.example24.model")
public class BharatiDairyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BharatiDairyApplication.class, args);
	}
}
