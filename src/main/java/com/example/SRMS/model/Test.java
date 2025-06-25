package com.example.SRMS.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalTime;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Tests")

@Data
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID TestId;

    @ManyToOne
    @JoinColumn(name = "CourseId", nullable = false)
    private Course CourseId;

    @Column(nullable = false)
    private Integer totalMarks;

    @Column(nullable = false)
    private Integer totalQuestions;

    @Column(nullable = false)
    private Integer positiveMarks;

    @Column(nullable = false)
    private String testName;

    @Column(nullable = false)
    private String testType;

    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
    private List<Question> questions;

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
