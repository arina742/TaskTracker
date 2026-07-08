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
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(()->new RuntimeException("Полтзователь не найден"));
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(Long id, User user) {
        User newUser = userRepository.findById(id).orElseThrow(()->new RuntimeException("Пользователь не найден"));
        newUser.setUsername(user.getUsername());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        newUser.setRole(user.getRole());
        newUser.setTasksByAssignee(user.getTasksByAssignee());
        newUser.setTasksByAuthor(user.getTasksByAuthor());
        userRepository.save(newUser);
        return newUser;
    }
}
