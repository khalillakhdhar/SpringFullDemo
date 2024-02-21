package com.elite.rh.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elite.rh.model.Task;
import com.elite.rh.repositories.TaskRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class TaskServiceImplement implements TaskServiceInterface {

	private final TaskRepository taskRepository;
	
	
	@Override
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return taskRepository.findAll();
	}

	@Override
	public Task getOneTask(long id) {
		// TODO Auto-generated method stub
		return taskRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteOneTask(long id) {
		// TODO Auto-generated method stub
		taskRepository.deleteById(id);

	}

	@Override
	public void deleteAllTask() {
		// TODO Auto-generated method stub
taskRepository.deleteAll();
	}

	@Override
	public Task addOneTask(Task task) {
		// TODO Auto-generated method stub
		return taskRepository.save(task);
	}

}
