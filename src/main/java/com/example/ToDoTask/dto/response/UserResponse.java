package com.example.ToDoTask.dto.response;

import com.example.ToDoTask.enums.Role;
import com.example.ToDoTask.enums.Status;
import com.example.ToDoTask.model.Task;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.List;

public class UserResponse {
    private Long id;
    private String username;
    private String email;
    private Role role;
    private List<Task> tasksByAuthor;
    private List<Task> tasksByAssignee;

}
