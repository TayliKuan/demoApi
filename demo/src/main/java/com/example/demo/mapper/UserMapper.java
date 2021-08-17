package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {
	
	@Select("SELECT * FROM USERS")
	public List<User> findAll();
	
	@Select("SELECT * FROM USERS WHERE UNO = #{uno}")
	public User findOne(Integer uno);

}
