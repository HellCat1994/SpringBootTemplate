package com.springboot.demo.dao;

import com.springboot.demo.pojo.Student;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @author whg
 */
public interface StudentMapper {
    Student getStudentInformationById(int id);

    List<Student> getStudentsByName(String name);
}
