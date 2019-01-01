package com.springboot.demo.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author whg
 */
@Getter
@Setter
public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
}
