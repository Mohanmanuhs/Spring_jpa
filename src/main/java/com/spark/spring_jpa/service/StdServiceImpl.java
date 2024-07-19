package com.spark.spring_jpa.service;

import com.spark.spring_jpa.dao.StudentRequest;
import com.spark.spring_jpa.model.Student;
import com.spark.spring_jpa.repo.StudentRepo;
import com.spark.spring_jpa.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StdServiceImpl implements StdService {
    @Autowired
    StudentRepo studentRepo;


    @Override
    public List<Student> getAllStudentsByCourse(String st_course) {
        return studentRepo.findByStCourse(st_course);
    }

    @Override
    public void saveStudentData(StudentRequest studentRequest) {
        studentRepo.save(Utility.Mapper(studentRequest));
    }

    @Override
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.getAllStudentData();
    }
}
