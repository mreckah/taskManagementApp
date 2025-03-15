package com.App.Task.app.repo;


import com.App.Task.app.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepo extends JpaRepository<Task,Long> {
}
