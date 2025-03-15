package com.App.Task.app.Controller;


import com.App.Task.app.model.Task;
import com.App.Task.app.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000")
public class ToDoController {
    @Autowired
    ToDoService service;

    @GetMapping("/fetch")
    public List<Task> fetch(){
        return service.fetchTasks();
    }
    @PostMapping("/store")
    public String store(@RequestBody Task task) {
        service.addTask(task);
        return "added successfully";
    }

}
