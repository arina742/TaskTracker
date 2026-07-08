package com.example.ToDoTask.controller;

import com.example.ToDoTask.model.Task;
import com.example.ToDoTask.model.User;
import com.example.ToDoTask.service.TaskServiceImpl;
import com.example.ToDoTask.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskServiceImpl taskService;

    @GetMapping
    public ResponseEntity<List<Task>> getAll() {
        return ResponseEntity.ok( taskService.getAllTask());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getById(@PathVariable Long id){
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody Task task){
        return ResponseEntity.ok(taskService.save(task));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@PathVariable Long id, @RequestBody Task task){
        return ResponseEntity.ok(taskService.update(id, task));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        taskService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
