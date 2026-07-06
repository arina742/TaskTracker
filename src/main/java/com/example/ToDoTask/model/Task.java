package com.example.ToDoTask.model;


import com.example.ToDoTask.enums.Role;
import com.example.ToDoTask.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Entity
@Table(name = "taskss")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "deadline", nullable = false)
    private LocalDateTime deadline;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private User authorId;

    @ManyToOne
    @JoinColumn(name = "assignee_id")
    private User assigneeId;

    public Task(String title, String description, Status status, Role role, LocalDateTime createdAt, LocalDateTime deadline, User authorId, User assigneeId) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.role = role;
        this.createdAt = createdAt;
        this.deadline = deadline;
        this.authorId = authorId;
        this.assigneeId = assigneeId;
    }
}
