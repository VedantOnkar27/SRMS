package com.example.SRMS.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Score")

@Data
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String ScoreId;

    @Column(nullable = false)
    private String UserId;
    private String TestId;
    private String CourseId;
    private String SubmissionId;
    private Integer Score;
    private String Remarks;
    private String Status;
}
