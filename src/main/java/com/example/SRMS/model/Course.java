package com.example.SRMS.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Courses")

@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    private UUID CourseId;

    @Column(nullable = false)
    private String name;

    private String description;
    private String duration;
    private String fee;
    private String topics;
    private String prerequisites;

    @ManyToMany(mappedBy = "courses")
    private List<User> users;
}
