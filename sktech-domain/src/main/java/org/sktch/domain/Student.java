package org.sktch.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Student {
    private Integer id;
    private String name;
    private List<Course> courses = new ArrayList<Course>();

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
