package com.example.newostore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.newostore.model.User;
import com.example.newostore.repository.UserRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserRestFul {
	@Autowired
	private UserRepository userRepository;
	@GetMapping("/user")
	public List<User> getUsers() {

		return userRepository.findAll();
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id) {

		return userRepository.findOne(id);
	}

	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable int id) {
		userRepository.delete(id);
		return true;
	}   

	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);

	}

	@PutMapping("/user/{id}")
	public User updateUser(@RequestBody User user,@PathVariable Long id) {
		return userRepository.save(user);

	}
}

