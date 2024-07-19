package com.spark.spring_jpa.service;

import com.spark.spring_jpa.dao.StudentRequest;
import com.spark.spring_jpa.model.Student;

import java.util.List;

public interface StdService {



    List<Student> getAllStudentsByCourse(String course);
    void saveStudentData(StudentRequest studentRequest);


    void deleteStudent(int id);

    List<Student> getAllStudent();
}
