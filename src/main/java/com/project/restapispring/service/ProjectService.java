package com.project.restapispring.service;

import org.springframework.http.ResponseEntity;

import com.project.restapispring.model.Project;

public interface ProjectService {

	ResponseEntity<?> findAll();

	ResponseEntity<?> findById(int id);

	ResponseEntity<?> save(Project project);

	ResponseEntity<?> delete(int id);

	ResponseEntity<?> update(Project project);

}
