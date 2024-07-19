package com.spark.spring_jpa.repo;

import com.spark.spring_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//JpaRepository is used for pagination
//JpaRepository = CrudRepository + Pagination
//spring jpa will automatically give its implementation
@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {

    //use camel case , jpa automatically gives its implementation
    //select * from students_tb where stCourse = 'course'
    List<Student> findByStCourse(String st_course);

    @Query(value = "select * from students_tb",nativeQuery = true)
    public List<Student> getAllStudentData();

}
