package com.springboot.demo.controller;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.pojo.Student;
import com.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
/**
 * @author Administrator
 */
@RestController
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/get")
    public Map<String,Object> getInformationById(int id){
        Student student = studentService.getInformationById(id);
        Map<String,Object> map = new HashMap<>(1);
        map.put("student",student);
        return map;
    }
    @PostMapping("/getname")
    public Map<String,Object> getInformationByName(@RequestParam("startPage") int startPage,@RequestParam("pageNum") int pageNum,@RequestParam("name") String name){
        PageInfo pageInfo = studentService.getStudentsByName(startPage,pageNum,name);
        Map<String,Object> map = new HashMap<>(1);
        map.put("name",pageInfo);
        return map;
    }
}
