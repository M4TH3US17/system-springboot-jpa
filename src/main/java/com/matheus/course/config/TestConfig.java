package com.matheus.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.matheus.course.entities.User;
import com.matheus.course.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maysa Jhiovanna", "maysajhio@gmail.com", "maysa123", "(92) 00000-0000");
		User u2 = new User(null, "Tommy Dalvino", "tommy@gmail.com", "tommy123", "(92) 00000-0000");
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
