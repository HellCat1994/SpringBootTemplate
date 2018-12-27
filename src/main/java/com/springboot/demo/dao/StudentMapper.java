package com.springboot.demo.dao;

import com.springboot.demo.pojo.Student;

import java.util.List;

public interface StudentMapper {
    Student getStudentInformationById(int id);
    List<Student> getStudentsByName(String name);
}
