package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController 
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public String createUser(User user) {
		
		return "新增成功";
	}
	
	@GetMapping("/user/{uno}")
	public User findOne(@PathVariable Integer uno){
		return userService.findOne(uno);
	}
	
	@GetMapping("/user/all")
	public List<User> findAll(){
		return userService.findAll();
	}
	
}
