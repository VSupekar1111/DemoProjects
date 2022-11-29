package com.client.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.client.demo.constants.DemoRoutings;
import com.client.demo.model.User;

@RestController
@RequestMapping
public class DemoController {

	@GetMapping(value=DemoRoutings.GET_USER)
	public ResponseEntity<List<User>> getAllUser()
	{
		List<User> empList =new ArrayList<>();
		try {
		
		RestTemplate restTemplate=new RestTemplate();
		empList =(List<User>) restTemplate.getForObject(DemoRoutings.GET_USER_CLIENT, List.class);
		
		return ResponseEntity.ok(empList);
		}catch(Exception e)
		{
			return ResponseEntity.internalServerError().body(empList);
		}
	}
	
}
