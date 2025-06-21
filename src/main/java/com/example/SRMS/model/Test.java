package com.example.SRMS.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalTime;
import java.util.HashSet;

@Entity
@Table(name = "Test")

@Data
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String TestId;

    @Column(nullable = false)
    private String CourseId;
    private Integer totalMarks;
    private Integer totalQuestions;
    private Integer positiveMarks;
    private String testName;
    private String testType;
    private HashSet<Integer> questionIds;

    private Integer duration;
    private Integer passingMarks;
    private Integer negativeMarks;
    private String testDescription;
    private String topics;


    @CreationTimestamp
    private LocalTime createdAt;

    @UpdateTimestamp
    private LocalTime updatedAt;
}
