package com.educandoweb.cousre.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.cousre.entities.User;
import com.educandoweb.cousre.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Nelton", "n@gmail", "889u99", "levitinha2");
		User u2 = new User(null, "Odete", "n@gmail", "889u99", "levitinha2");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
