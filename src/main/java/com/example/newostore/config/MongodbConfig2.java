package com.example.newostore.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.newostore.model.User;
import com.example.newostore.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses=UserRepository.class)
@Configuration
public class MongodbConfig2 {
		@Bean
		CommandLineRunner commandLineRunner (UserRepository userRepository) {
			return  strings -> {
					userRepository.save(new User (1,"kjkljlk","kjkljlk","kjkljlk","kjkljlk","kjkljlk"));
					
				
			};
		}

}
