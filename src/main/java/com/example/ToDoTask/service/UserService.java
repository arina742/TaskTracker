package com.example.ToDoTask.service;

import com.example.ToDoTask.model.Task;
import com.example.ToDoTask.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(Long id);
    void deleteById(Long id);
    User save(User user);
    User update(Long id, User user);
}
