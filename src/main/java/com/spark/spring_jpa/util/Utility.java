package com.spark.spring_jpa.util;

import com.spark.spring_jpa.dao.StudentRequest;
import com.spark.spring_jpa.model.Student;

public class Utility {
    public static Student Mapper(StudentRequest studentRequest) {
        Student st = new Student();
        st.setSt_name(studentRequest.getSt_name());
        st.setSt_course(studentRequest.getSt_course());
        st.setSt_address(studentRequest.getSt_address());
        return st;
    }


}
