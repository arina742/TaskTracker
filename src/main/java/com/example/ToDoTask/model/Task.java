package com.example.ToDoTask.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@NoArgsConstructor
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "", nullable = false) private String description;
    @Column(name = "", nullable = false) private Status status;
    @Column(name = "", nullable = false) private Role role;
    @Column(name = "", nullable = false) private String title;
    @Column(name = "", nullable = false) private LocalDateTime createdAt;
    @Column(name = "", nullable = false) private LocalDateTime deadline;
    @Column(name = "", nullable = false) private User authorId;
    @Column(name = "", nullable = false) private User assigneeId;

}
