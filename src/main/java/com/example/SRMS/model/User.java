package com.example.SRMS.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalTime;

@Entity
@Table(name = "User")

@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String UserId;

    @Column(nullable = false, unique = true)
    private Integer contact;
    private String email;
    private String username;

    @Column(nullable = false)
    private String firstName;
    private String lastName;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @CreationTimestamp
    private LocalTime createdAt;

    @UpdateTimestamp
    private LocalTime updatedAt;
}
