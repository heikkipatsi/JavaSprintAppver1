package com.heke.studentapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heke.studentapp.courses.course;
import com.heke.studentapp.service.studentService;
import com.heke.studentapp.students.student;

@RestController
public class StudentRestController {

    @Autowired
    studentService sService;

    @GetMapping("students")
    public List<student> getStudents() {
        return sService.getAllStudents();

    }

    @PostMapping("addstudent")
    public student addStudent(@RequestBody student student) {
        sService.addStudent(student);
        return student;
    }

    @GetMapping("courses")
    public List<course> getCourses() {
        return sService.getAllCourses();
    }

    @PostMapping("addcourse")
    public course addCourse(@RequestBody course course) {
        sService.addCourse(course);
        return course;
    }

    /*
     * @PostMapping("addcoursetostudent")
     * public String addCourse(@RequestParam String coursename, @RequestParam String description){
     * sService.addCourse(new);
     * return coursename;
     * }
     */
}