package com.example.SRMS.model;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.users.GenericRole;
import org.hibernate.annotations.CreationTimestamp;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Submissions")

@Data
public class Submission {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID SubmissionId;

    @ManyToOne
    @JoinColumn(name = "UserId", nullable = false)
    private User user;

    @Column(nullable = false)
    private Integer attemptNumber;

    @ManyToOne
    @JoinColumn(name = "TestId", nullable = false)
    private Test test;

    @OneToMany(mappedBy = "submission", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Answer> Answers;

    @ManyToOne
    @JoinColumn(name = "ScoreId")
    private Score score;

    @Column(nullable = false)
    private Integer correctAnswers;

    @Column(nullable = false)
    private Integer wrongAnswers;

    @Column(nullable = false)
    private Integer attemptedQuestions;

    @CreationTimestamp
    private java.time.LocalDateTime submittedAt;
}
