package com.example.ToDoTask.repository;

import com.example.ToDoTask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
