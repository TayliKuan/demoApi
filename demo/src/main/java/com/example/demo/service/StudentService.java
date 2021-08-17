package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;

@Service
public class StudentService {
	
	@Autowired
	private StudentMapper studentMapper;
	
	public String create(Student student) {
		studentMapper.create(student);
		return "新增成功";
	}
	
	public List<Student> readAll() {
		return studentMapper.readAll();
	}
	
	public Student read(Integer stuno) {
		return studentMapper.read(stuno);
	}
	
	public void update(Integer stuno,Student student) {
		student.setStuno(stuno);
		studentMapper.update(student);
	}
	
	public void delete(Integer stuno) {
		studentMapper.delete(stuno);
	}
}
