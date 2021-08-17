package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController 
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public Student createUser(@RequestBody Student student) {
		studentService.create(student);
		return student;
	}
	
	@GetMapping("/students/{stuno}")
	public Student read(@PathVariable Integer stuno) {
		return studentService.read(stuno);
	}
	
	@GetMapping("/students")
	public List<Student> readAll() {
		return studentService.readAll();
	}
	
	@PutMapping("/students/{stuno}")
	public Student update(@PathVariable Integer stuno,@RequestBody Student student) {
		studentService.update(stuno, student);
		return student;
	}
	
	@DeleteMapping("/students/{stuno}")
	public String delete(@PathVariable Integer stuno) {
		studentService.delete(stuno);
		return "刪除成功";
	}
}
