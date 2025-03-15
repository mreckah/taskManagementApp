package com.App.Task.app.service;

import com.App.Task.app.model.Task;

import java.util.List;

public interface ToDoService {

    public List<Task> fetchTasks();
    public Task addTask(Task task);
}
