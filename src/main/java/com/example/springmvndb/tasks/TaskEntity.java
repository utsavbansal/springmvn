package com.example.springmvndb.tasks;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity(name = "tasks")
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false)
    private Long id;

    @NonNull
    private String name;
    @NonNull
    private Date dueData;
    @NonNull
    private boolean completed;
}
