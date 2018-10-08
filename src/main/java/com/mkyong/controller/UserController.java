package com.mkyong.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mkyong.entities.User;
import com.mkyong.repository.UserRepository;


@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/getUsers")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable Long id){
		return userRepository.findOne(id);
	}
	@DeleteMapping("/deleteUser/{id}")
	public boolean deleteUser(@PathVariable Long id){
		userRepository.delete(id);
		return true;
	}
	@PostMapping("/createUser")
	public User createUser(User user){
		return userRepository.save(user); 
	}
	@PutMapping("/updateUser")
	public User updateUser(User user){
		return userRepository.save(user);
	}
}
