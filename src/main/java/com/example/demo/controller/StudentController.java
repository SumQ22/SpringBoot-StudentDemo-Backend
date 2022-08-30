package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@CrossOrigin
@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/")
	public void createStudent(@RequestBody Student student) {
		studentRepository.insert(student);
	}
	
	@PostMapping("/delete/{id}")
	public void deleteStudent(@PathVariable String id) {
		studentRepository.deleteById(id);
		
	}
	
	@GetMapping("/list")
	public List<Student> listStudents() {
		return studentRepository.findAll();
		
	}
	
	
}
