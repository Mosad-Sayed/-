package com.project.restapispring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.restapispring.model.Project;

public interface ProjectDao extends JpaRepository<Project, Integer> {

}
