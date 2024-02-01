package com.bharati.dairy.example23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.logging.Logger;

@SpringBootApplication
public class BharatiDairyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BharatiDairyApplication.class, args);
	}
}
