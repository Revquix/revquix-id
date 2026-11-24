package com.revquix.id;

import org.springframework.boot.SpringApplication;

public class TestRevquixIdApplication {

	public static void main(String[] args) {
		SpringApplication.from(RevquixIdApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
