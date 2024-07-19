package com.spark.spring_jpa.controller;


import com.spark.spring_jpa.model.Student;
import com.spark.spring_jpa.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepo studentRepo;


    @PostMapping("/save")   //to get parameters from browser
    public void saveStudent(@RequestParam String name,@RequestParam String address,@RequestParam String course){
        Student st1 = new Student();
        st1.setSt_name(name);
        st1.setSt_address(address);
        st1.setSt_course(course);

        //to save data into db
        studentRepo.save(st1);
    }

}
