package com.example.SRMS.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Scores")

@Data
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ScoreId;

    @ManyToOne
    @JoinColumn(name = "UserId", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "TestId", nullable = false)
    private Test test;

    @OneToMany(mappedBy = "score", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Submission> submissions;

    @Column(nullable = false)
    private Integer Score;
    private String Remarks;

    private ResultStatus Status;
}
