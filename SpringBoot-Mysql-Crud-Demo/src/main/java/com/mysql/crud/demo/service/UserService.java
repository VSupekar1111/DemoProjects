package com.mysql.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.crud.demo.UserRepository;
import com.mysql.crud.demo.entity.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User addUser(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {

		return userRepository.findAll();
	}

	public Optional<User> getMovieById(Integer id) {
		return userRepository.findById(id);
	}

}
