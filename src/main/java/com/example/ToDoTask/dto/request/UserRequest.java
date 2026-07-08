package com.example.ToDoTask.dto.request;

import com.example.ToDoTask.enums.Role;
import com.example.ToDoTask.model.Task;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

public class UserRequest {

    @NotBlank
    @Size(min = 3)
    private String username;

    @Email
    @Pattern(
            regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",
            message = "Почта невалидна"
    )
    private String email;

    @Size(min = 8)
    @NotBlank
    private String password;

    @NotBlank
    private Role role;

}
