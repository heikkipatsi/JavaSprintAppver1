package com.heke.studentapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heke.studentapp.courses.course;
import com.heke.studentapp.fileservice.StudentFileService;
import com.heke.studentapp.students.student;

@Service
public class studentService {


    @Autowired
    StudentFileService myFileService;
    
    private List<student> students = new ArrayList<>();
    private List<course> courses = new ArrayList<>();

    public void addStudent(student student) {
        students.add(student);
    }

    public List<student> getAllStudents() {
        return students;
    }

    public student getById(long studentid) {
        for (student student : students) {
            if (student.getStudentid() == studentid) {
                return student;
            }
        }

        return null;
    }

    public void addCourse(student coursename) {
        students.add(coursename);
    }

    public List<course> getAllCourses() {
        return courses;
    }

    public void addCourse(course course) {
    }

}
