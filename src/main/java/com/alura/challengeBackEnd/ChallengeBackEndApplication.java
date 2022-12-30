package com.alura.challengeBackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class ChallengeBackEndApplication {

	// TODO: adicionar banco mysql e módulo migration


	public static void main(String[] args) {
		SpringApplication.run(ChallengeBackEndApplication.class, args);
	}
}
