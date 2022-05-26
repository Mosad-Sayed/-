package com.project.restapispring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.restapispring.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
