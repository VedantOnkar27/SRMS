package com.example.SRMS.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Answers")

@Data
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer AnswerId;

    @ManyToOne
    @JoinColumn(name = "QuestionId", nullable = false)
    private Question question;

    @ManyToOne
    @JoinColumn(name = "SubmissionId")
    private Submission submission;

    @Column(nullable = false)
    private String answerText;

    @ManyToOne
    @JoinColumn(name = "OptionId", nullable = false)
    private Option SelectedOption;

    private Boolean IsCorrect;
}
