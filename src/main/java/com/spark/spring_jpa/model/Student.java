package com.spark.spring_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students_tb")
public class Student{

    @Id
    @Column(name = "st_id")
    Integer st_id=0;

    @Column(name = "st_name")
    String st_name;

    @Column(name = "st_address")
    String st_address;

    @Column(name = "st_course")
    String st_course;

    public int getSt_id() {
        return st_id;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public void setSt_address(String st_address) {
        this.st_address = st_address;
    }

    public void setSt_course(String st_course) {
        this.st_course = st_course;
    }

    public String getSt_name() {
        return st_name;
    }

    public String getSt_course() {
        return st_course;
    }

    public String getSt_address() {
        return st_address;
    }


}