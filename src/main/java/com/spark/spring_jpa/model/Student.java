package com.spark.spring_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



//Never ever use underscore for variable names in java
//u can use it for sql variables
// use camel case for variable in java
@Entity
@Table(name = "students_tb")
public class Student{

    @Id
    @Column(name = "st_id")
    Integer stId =0;

    @Column(name = "st_name")
    String stName;

    @Column(name = "st_address")
    String stAddress;

    @Column(name = "st_course")
    String stCourse;

    public int getStId() {
        return stId;
    }

    public void setSt_name(String st_name) {
        this.stName = st_name;
    }

    public void setSt_address(String st_address) {
        this.stAddress = st_address;
    }

    public void setSt_course(String st_course) {
        this.stCourse = st_course;
    }

    public String getSt_name() {
        return stName;
    }

    public String getSt_course() {
        return stCourse;
    }

    public String getSt_address() {
        return stAddress;
    }


}