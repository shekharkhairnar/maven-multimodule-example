package org.sktech.business;

import org.sktch.domain.ComplimentryCourse;
import org.sktch.domain.Course;
import org.sktch.domain.Student;

import java.util.List;
import java.util.stream.Collectors;

public class BusinessTest {
    public static void main(String[] args) {
        Student student = new Student(1, "Shekhar");
        student.getCourses().add(new Course(1,"Java"));
        student.getCourses().add(new Course(2,"Spring"));
        student.getCourses().add(new Course(3,"Hibernate"));

        List<ComplimentryCourse> allCourse = student.getCourses().stream().flatMap(c -> c.getComplimentryCourses().stream()).collect(Collectors.toList());
        System.out.println(allCourse);
    }
}
