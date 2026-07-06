package com.example.ToDoTask.repository;

import com.example.ToDoTask.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
