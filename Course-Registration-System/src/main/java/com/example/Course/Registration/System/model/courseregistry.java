package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class courseregistry {
    //stores who registered which course with emailid
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//no need to provide value
    private String name;

    public courseregistry(String name, String emailid, String coursename) {
        this.name = name;
        Emailid = emailid;
        this.coursename = coursename;
    }
    public courseregistry(){

    }

    private String Emailid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return Emailid;
    }

    public void setEmailid(String emailid) {
        Emailid = emailid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    private String coursename;


}
