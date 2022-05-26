package com.project.restapispring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.restapispring.model.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Integer> {

}
