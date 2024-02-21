package com.elite.rh.model.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elite.rh.model.Task;
import com.elite.rh.model.service.TaskServiceInterface;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("task")
@RequiredArgsConstructor
public class TaskController {
	
	final TaskServiceInterface taskServiceInterface;
@PostMapping
public  Task addOne(@RequestBody Task task)
{
	return taskServiceInterface.addOneTask(task); 
	
}
@GetMapping
public List<Task> getAll()
{
return taskServiceInterface.getAllTasks();	
}
@DeleteMapping("/{id}")
public void deleteOne(@PathVariable long id)
{
taskServiceInterface.deleteOneTask(id);	
}
public void deleteAll()
{
taskServiceInterface.deleteAllTask();	
}
@GetMapping("/{id}")
public Task getOne(@PathVariable long id)
{
return taskServiceInterface.getOneTask(id);	
}
}
