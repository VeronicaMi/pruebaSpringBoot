package com.indra.bbva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BbvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbvaApplication.class, args);
		System.out.println("Hello Indra");
		System.out.println("No hay error de conexion");
	}

}
