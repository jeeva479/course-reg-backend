package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.course;
import com.example.Course.Registration.System.model.courseregistry;
import com.example.Course.Registration.System.repository.courseregrepo;
import com.example.Course.Registration.System.repository.courserepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class courseservice {
    @Autowired
    courserepo cr;
    @Autowired
    courseregrepo repo;
    public List availablecourses() {
        return cr.findAll();
    }
    public List<courseregistry> enrolledstudents() {
        return repo.findAll();
    }

    public void enrollcourse(String name, String emailid, String coursename) {
        courseregistry cn=new courseregistry(name,emailid,coursename);
        repo.save((cn));
    }
}
