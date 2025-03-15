package com.App.Task.app.model;

import jakarta.persistence.*;
import lombok.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name ="to do list" )
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String description;
    private boolean done;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date deadline;
    private int priority;

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", priority=" + priority +
                ", done=" + done +
                '}';
    }
}
