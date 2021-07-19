package org.sktch.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Course {
    private Integer id;
    private String name;
    List<ComplimentryCourse> complimentryCourses;

    public Course(Integer id, String name) {
        this.id = id;
        this.name = name;
        complimentryCourses = addComplimentryCourses(id);
    }

    private List<ComplimentryCourse> addComplimentryCourses(Integer id) {
        switch (id) {
            case 1: {
                List<ComplimentryCourse> complimentryCourses = new ArrayList<ComplimentryCourse>();
                complimentryCourses.add(new ComplimentryCourse(1, "Java 8 Fetures"));
                complimentryCourses.add(new ComplimentryCourse(2, "Advance Java"));
                return complimentryCourses;
            }
            case 2: {
                List<ComplimentryCourse> complimentryCourses = new ArrayList<ComplimentryCourse>();
                complimentryCourses.add(new ComplimentryCourse(3, "Spring Boot"));
                return complimentryCourses;
            }
            case 3: {
                List<ComplimentryCourse> complimentryCourses = new ArrayList<ComplimentryCourse>();
                complimentryCourses.add(new ComplimentryCourse(4, "Database Management"));
                return complimentryCourses;
            }
            default:{
                return new ArrayList<ComplimentryCourse>();
            }
        }
    }
}
