package com.alura.challengeBackEnd;

import com.alura.challengeBackEnd.domain.model.Video;
import com.alura.challengeBackEnd.domain.repository.VideosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ChallengeBackEndApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeBackEndApplication.class, args);
	}

	@Autowired
	VideosRepository videosRepository;

	@Override
	public void run(String... args) throws Exception {
		Video videos1 = new Video(1L, "Teste1", "Descrição de teste 1", "https://www.youtube.com/watch?v=StKAATHjwA0&ab_channel=GameV");
		Video videos2 = new Video(2L, "Teste2", "Descrição de teste 2", "https://www.youtube.com/watch?v=XL0GkPWeYvY&ab_channel=Shirrako");
		Video videos3 = new Video(3L, "Teste3", "Descrição de teste 3", "https://www.youtube.com/watch?v=FYNL6XHO5ZQ&ab_channel=MeteoroBrasil");

		videosRepository.saveAll(Arrays.asList(videos1, videos2, videos3));
	}
}
