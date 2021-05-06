package com.wignersantos.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.wignersantos.workshopmongo.domain.User;
import com.wignersantos.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com", "947895378");
		User alex = new User(null, "Alex Green", "alex@gmail.com", "935689247");
		User bob = new User(null, "Bob Grey", "bob@gmail.com", "588924749");
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
	}

	
}
