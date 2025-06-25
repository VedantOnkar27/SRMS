package com.example.SRMS.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Users")

@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID UserId;

    @ManyToMany
    @JoinTable (
            name = "StudentCourses",
            joinColumns = @JoinColumn(name = "UserId", referencedColumnName = "UserId"),
            inverseJoinColumns = @JoinColumn(name = "CourseId", referencedColumnName = "CourseId")
    )
    private List<Course> courses;

    @OneToMany
    @JoinColumn(name = "user")
    List<Submission> submissions;

    @Column(nullable = false)
    private Integer contact;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @CreationTimestamp
    private LocalTime createdAt;

    @UpdateTimestamp
    private LocalTime updatedAt;
}
