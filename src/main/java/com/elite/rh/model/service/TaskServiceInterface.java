package com.elite.rh.model.service;

import java.util.List;

import com.elite.rh.model.Task;

public interface TaskServiceInterface {
	List<Task> getAllTasks();
	Task getOneTask(long id);
	void deleteOneTask(long id);
	void deleteAllTask();
	Task addOneTask(Task task);

}
