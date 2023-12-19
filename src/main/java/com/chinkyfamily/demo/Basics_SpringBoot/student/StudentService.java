package com.chinkyfamily.demo.Basics_SpringBoot.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    List<Student> getStudents() {
        Student firstStudent = new Student("Mariyam", "mariyam.kazi@gmail.com", LocalDate.of(1993, 9, 13), 30);
        Student secondStudent = new Student("Ivy", "ivy.fernandez@gmail.com", LocalDate.of(1992, 7, 27), 31);
        return List.of(firstStudent, secondStudent);
    }
}
