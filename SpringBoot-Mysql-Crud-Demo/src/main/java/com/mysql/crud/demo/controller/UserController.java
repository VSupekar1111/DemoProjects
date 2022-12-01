package com.mysql.crud.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.crud.demo.entity.User;
import com.mysql.crud.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/add-user")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "User added";
	}

	@GetMapping("/get-all-users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/get-user/{id}")
	public  ResponseEntity<> getUserById(@PathVariable int id) throws Exception{
		Optional<User> users;
		try {
			  users= userService.getUserById(id);
			return ResponseEntity.ok(users);
		} catch (Exception e) {
			return ResponseEntity.notFound();
		}
		return null;
	}
	
}
