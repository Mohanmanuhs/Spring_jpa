package com.spark.spring_jpa.dao;


//just used to convert user request to Student class
public class StudentRequest {


    int st_id=0;

    String st_name;

    String st_address;

    String st_course;

    String DOB;

    String enrollment_Id;


    public int getSt_id() {
        return st_id;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getSt_address() {
        return st_address;
    }

    public void setSt_address(String st_address) {
        this.st_address = st_address;
    }

    public String getSt_course() {
        return st_course;
    }

    public void setSt_course(String st_course) {
        this.st_course = st_course;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEnrollment_Id() {
        return enrollment_Id;
    }

    public void setEnrollment_Id(String enrollment_Id) {
        this.enrollment_Id = enrollment_Id;
    }



}
