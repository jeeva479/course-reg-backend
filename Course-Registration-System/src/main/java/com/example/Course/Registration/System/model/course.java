package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class course {
    //have to be transformed to table
    @Id
    private String courseId;//primary so at the top ID
    private String courseName;
    private String trainer;
    private int durationinweek;

    public String getCourseName() {
        return courseName;
    }

    public void setCoursename(String courseName) {
        this.courseName = courseName;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public int getDurationinweek() {
        return durationinweek;
    }

    public void setDurationinweek(int durationinweek) {
        this.durationinweek = durationinweek;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCoursed(String courseId) {
        this.courseId = courseId;
    }
}
