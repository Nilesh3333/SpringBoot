package com.swe.backend.controller;
//Author : Nilesh Bommisetty
//This java file is responsable for RestApi calls
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.swe.backend.exception.ResourceNotFoundException;
import com.swe.backend.model.Student;
import com.swe.backend.repository.StudentRepo;

@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"})
@RestController
@RequestMapping("/api/v1/")
public class StudentController {

	@Autowired
	private StudentRepo studentRepo;
	
	//get all Students
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	
	//post the data to Database
	@PostMapping("/students")
	@ResponseBody
	public Student addStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}
	
	
	
}
