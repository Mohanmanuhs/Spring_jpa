package com.spark.spring_jpa.controller;


import com.spark.spring_jpa.dao.StudentRequest;
import com.spark.spring_jpa.model.Student;
import com.spark.spring_jpa.service.StdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StdService stdService;


    @GetMapping("/get/{course}")
    public List<Student> getStudentsByCourse(@PathVariable String course){
        List<Student> byStCourse = stdService.getAllStudentsByCourse(course);

        return byStCourse;
    }

    @DeleteMapping("delete/{id}")
    public void deleteStudent(@PathVariable int id)
    {
        stdService.deleteStudent(id);
    }

    @GetMapping("/get")
    public List<Student> getAllStudent()
    {
        List<Student> allStudent = stdService.getAllStudent();
        return allStudent;
    }

    @PostMapping("/save")
    public void saveStudent(@RequestBody StudentRequest studentRequest){
        //to save data into db
        stdService.saveStudentData(studentRequest);
    }

   /* @PostMapping("/save")   //to get parameters from browser
    public void saveStudent(@RequestParam String name,@RequestParam String address,@RequestParam String course){
        Student st1 = new Student();
        st1.setSt_name(name);
        st1.setSt_address(address);
        st1.setSt_course(course);

        //to save data into db
        studentRepo.save(st1);
    }*/

}
