package com.springboot.demo.service;

import com.github.pagehelper.PageInfo;
import com.springboot.demo.pojo.Student;


public interface StudentService {
    Student getInformationById(int id);
    PageInfo getStudentsByName(int startPage, int pageNum,String name);
}
