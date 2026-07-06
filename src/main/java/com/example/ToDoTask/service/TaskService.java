package com.example.ToDoTask.service;

import com.example.ToDoTask.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTask();
    Task getTaskById(Long id);
    void deleteById(Long id);
    Task save(Task task);
    Task update(Long id, Task task);
}
