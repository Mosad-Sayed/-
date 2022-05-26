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

import com.project.restapispring.model.Project;
import com.project.restapispring.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService ;
	@GetMapping
	public ResponseEntity<?> FindAll() {
		return projectService.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> FindById(@PathVariable int id) {
		return projectService.findById(id);
	}

	@PostMapping
	public ResponseEntity<?> save(@RequestBody Project project) {
		return projectService.save(project);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Project project) {
		return projectService.update(project);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		return projectService.delete(id);
	}

}
