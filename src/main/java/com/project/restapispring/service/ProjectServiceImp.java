package com.project.restapispring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.restapispring.dao.ProjectDao;
import com.project.restapispring.model.Project;

@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	private ProjectDao projectDao;

	@Override
	public ResponseEntity<?> findAll() {
		return new ResponseEntity<List<Project>>(projectDao.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> findById(int id) {
		return new ResponseEntity<Project>(projectDao.findById(id).get(), HttpStatus.OK);

	}

	@Override
	public ResponseEntity<?> save(Project Project) {
		return new ResponseEntity<Project>(projectDao.save(Project), HttpStatus.CREATED);

	}

	@Override
	public ResponseEntity<?> update(Project Project) {
		return new ResponseEntity<Project>(projectDao.save(Project), HttpStatus.OK);

	}

	@Override
	public ResponseEntity<?> delete(int id) {
		projectDao.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

}
