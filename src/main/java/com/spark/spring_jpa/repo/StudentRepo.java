package com.spark.spring_jpa.repo;

import com.spark.spring_jpa.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//spring jpa will automatically give its implementation
@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {

}
