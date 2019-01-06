package com.example.newostore.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.newostore.model.User;

@CrossOrigin(origins = "http://localhost:4200")

public interface UserRepository extends MongoRepository<User, Integer> {
	
	
}

