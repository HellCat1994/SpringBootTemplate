package com.springboot.demo.service.implement;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.dao.StudentMapper;
import com.springboot.demo.pojo.Student;
import com.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student getInformationById(int id) {
        return studentMapper.getStudentInformationById(id);
    }

    @Override
    public PageInfo getStudentsByName(int startPage, int pageNum,String name){
        PageHelper.startPage(startPage,pageNum);
        List<Student> studentList = studentMapper.getStudentsByName(name);
        PageInfo pageInfo = new PageInfo(studentList);
        return pageInfo;
    }
}
