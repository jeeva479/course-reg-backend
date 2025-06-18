package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courserepo extends JpaRepository<course,String> {//string primary key type

}
