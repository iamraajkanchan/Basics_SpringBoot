package com.chinkyfamily.demo.Basics_SpringBoot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    List<Student> getStudents() {
        return studentService.getStudents();
    }

    /**
     * Set Content-type: application/json
     * Set Body: raw with JSON
     * */
    @PostMapping
    public void registerStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    /**
     * Set Content-type: application/text
     * Set Body: raw with Text
     * */
    @DeleteMapping
    public void deleteStudent(@RequestBody String email) {
        studentService.deleteStudent(email);
    }
}
