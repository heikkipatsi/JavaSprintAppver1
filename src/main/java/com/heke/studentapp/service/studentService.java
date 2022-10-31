package com.heke.studentapp.service;

import java.io.FileNotFoundException;
import java.io.IOException;
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

    public void savePersistentData() {
        try {
            myFileService.writeStudentsToFile(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readPersistentData() {
        try {
            myFileService.readStudentsFromFile(students);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

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

    public void addCourse(course course) {
        courses.add(course);
    }

    public List<course> getAllCourses() {
        return courses;
    }

    public course getByCId(long courseid) {
        for (course course : courses) {
            if (course.getCourseid() == courseid) {
                return course;
            }
        }

        return null;
    }
}
