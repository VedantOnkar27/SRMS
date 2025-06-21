package com.example.SRMS.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Course")

@Data
public class Course {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private String CourseId;

    private String name;
    private String description;
    private String duration;
    private String fee;
    private String topics;
    private String prerequisites;
}
