package com.example.SRMS.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashMap;

@Entity
@Table(name = "Question")

@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String QuestionId;

    @Column(nullable = false)
    private String questionText;
    private HashMap<String, Boolean> options;
}
