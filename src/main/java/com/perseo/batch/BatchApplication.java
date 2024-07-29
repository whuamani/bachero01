package com.perseo.batch;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Log4j2
@SpringBootApplication
public class BatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		log.info("############################################");
		log.info("Java: ejecutando algo en linea de comandos");
		log.debug("Java: debug");
		log.error("java: error");
		log.info("############################################");
	}
}
