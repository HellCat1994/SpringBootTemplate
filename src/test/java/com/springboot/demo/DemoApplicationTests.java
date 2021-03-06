package com.springboot.demo;

import com.springboot.demo.dao.StudentMapper;
import com.springboot.demo.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void contextLoads() {
        Student student = studentMapper.getStudentInformationById(1);
        System.out.println(student.getName());
    }

}

