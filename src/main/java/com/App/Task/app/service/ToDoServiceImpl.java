package com.App.Task.app.service;


import com.App.Task.app.model.Task;
import com.App.Task.app.repo.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {
    @Autowired
    ToDoRepo repo;
    @Override
    public List<Task> fetchTasks(){
        return repo.findAll();
    }
    @Override
    public Task addTask(Task task){
         return repo.save(task);
    }

}
