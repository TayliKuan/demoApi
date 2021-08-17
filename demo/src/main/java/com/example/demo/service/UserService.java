package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	public List<User> findAll(){
		return userMapper.findAll();
	}
	
	public User findOne(Integer uno) {
		return userMapper.findOne(uno);
	}
}
