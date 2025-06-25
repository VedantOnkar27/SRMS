package com.example.SRMS.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Options")

@Data
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer OptionId;

    @Column(nullable = false)
    private String OptionText;

    @Column(nullable = false)
    private Boolean IsCorrect;

    @ManyToOne
    @JoinColumn(name = "QuestionId", nullable = false)
    private Question question;
}
