package com.example.ToDoTask.dto.response;

import com.example.ToDoTask.enums.Role;
import com.example.ToDoTask.enums.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

public class UserResponse {
    @NotNull
    Long id;
    @NotNull
    @NotBlank
    @Length(min = 2)
    String title;
    @NotBlank
    String description;
    Status status;
    Role role;
    LocalDateTime createdAt;
    LocalDateTime deadline;
}
