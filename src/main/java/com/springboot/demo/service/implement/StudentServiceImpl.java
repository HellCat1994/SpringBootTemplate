package com.springboot.demo.service.implement;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.dao.StudentMapper;
import com.springboot.demo.pojo.Student;
import com.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author whg
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    @Cacheable(cacheNames = "stu",key = "'['+#id+']'")
    public Student getInformationById(int id) {
        System.out.println("打印信息");
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
