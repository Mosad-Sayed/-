package com.project.restapispring.service;

import org.springframework.http.ResponseEntity;

import com.project.restapispring.model.Student;

public interface StudentService {

	ResponseEntity<?> findAll();

	ResponseEntity<?> findById(int id);

	ResponseEntity<?> save(Student student);

	ResponseEntity<?> delete(int id);

	ResponseEntity<?> update(Student student);

}
