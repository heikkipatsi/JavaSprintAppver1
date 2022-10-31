package com.heke.studentapp.fileservice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import org.springframework.stereotype.Service;

import com.heke.studentapp.students.student;

@Service
public class StudentFileService {
    public void writeStudentsToFile(List<student> students) throws IOException {
        FileWriter fw = new FileWriter(new File("students.txt"));
    }

    public List<student> readStudentsFromFile(List<student> students) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("students.txt"));
        return students;
    }
}
