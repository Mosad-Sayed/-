package com.project.restapispring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.restapispring.model.Student;
import com.project.restapispring.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	@GetMapping
	public ResponseEntity<?> FindAll() {
		return studentService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> FindById(@PathVariable int id) {
		return studentService.findById(id);
	}

	@PostMapping
	public ResponseEntity<?> save(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Student student) {
		return studentService.update(student);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		return studentService.delete(id);
	}

}
