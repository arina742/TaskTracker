package com.example.ToDoTask.controller;

import com.example.ToDoTask.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TaskController {

    @Autowired
    public TaskServiceImpl taskService;

}
