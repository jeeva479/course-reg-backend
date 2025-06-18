package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.course;
import com.example.Course.Registration.System.model.courseregistry;
import com.example.Course.Registration.System.repository.courseregrepo;
import com.example.Course.Registration.System.service.courseservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController//this class's object creation is maintained by spring
@CrossOrigin(origins ="*")
public class coursecontroller {
    @Autowired
    courseservice cs;
    @Autowired
    courseregrepo repo;
    @GetMapping("courses")
    public List<course> availablecourses(){
        return cs.availablecourses();
    }

    @GetMapping("courses/enrolled")
    public List<courseregistry> emrollednstudents(){
        return cs.enrolledstudents();
    }

    @PostMapping("/courses/register")
    public String enrollcourse(@RequestParam("name") String name,
                               @RequestParam("Emailid") String emailid,
                               @RequestParam("coursename") String coursename){
        cs.enrollcourse(name,emailid,coursename);
        return "congratulation!"+name+",enrolled succuessfully";
    }

}
