package com.project.restapispring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.restapispring.dao.StudentDao;
import com.project.restapispring.model.Student;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired

	private StudentDao studentDao;

	@Override
	public ResponseEntity<?> findAll() {
		return new ResponseEntity<List<Student>>(studentDao.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> findById(int id) {
		return new ResponseEntity<Student>(studentDao.findById(id).get(), HttpStatus.OK);

	}

	@Override
	public ResponseEntity<?> save(Student student) {
		return new ResponseEntity<Student>(studentDao.save(student), HttpStatus.OK);

	}

	@Override
	public ResponseEntity<?> update(Student student) {
		return new ResponseEntity<Student>(studentDao.save(student), HttpStatus.OK);

	}

	@Override
	public ResponseEntity<?> delete(int id) {
		studentDao.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

}
