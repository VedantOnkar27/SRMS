package com.example.SRMS.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Submission")

@Data
public class Submission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String SubmissionId;

    @Column(nullable = false)
    private String UserId;
    private String TestId;
    private Integer attemptNumber;
    private Integer correctAnswers;
    private Integer wrongAnswers;
    private Integer attemptedQuestions;
}
