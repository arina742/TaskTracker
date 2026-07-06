package com.example.ToDoTask.controller;

import com.example.ToDoTask.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    public UserServiceImpl userService;
}
