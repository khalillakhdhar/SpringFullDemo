package com.elite.rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elite.rh.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
