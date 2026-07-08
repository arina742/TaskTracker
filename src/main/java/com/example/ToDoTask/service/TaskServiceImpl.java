package com.example.ToDoTask.service;

import com.example.ToDoTask.model.Task;
import com.example.ToDoTask.repository.TaskRepository;
import com.example.ToDoTask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    public TaskRepository taskRepository;

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(()->new RuntimeException("Пользователь не найден"));
    }

    @Override
    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task update(Long id, Task task) {
        Task newTask = taskRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Пользователь с такм айд не существует"));
        newTask.setTitle(task.getTitle());
        newTask.setDescription(task.getDescription());
        newTask.setRole(task.getRole());
        newTask.setStatus(task.getStatus());
        newTask.setCreatedAt(task.getCreatedAt());
        newTask.setAssigneeId(task.getAssigneeId());
        newTask.setDeadline(task.getDeadline());
        taskRepository.save(newTask);
        return newTask;
    }
}
