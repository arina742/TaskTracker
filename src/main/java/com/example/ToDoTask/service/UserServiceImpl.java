package com.example.ToDoTask.service;

import com.example.ToDoTask.model.User;
import com.example.ToDoTask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserRepository userRepository;

    @Override
    public List<User> getAllTask() {
        return List.of();
    }

    @Override
    public User getTaskById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User update(Long id, User user) {
        return null;
    }
}
