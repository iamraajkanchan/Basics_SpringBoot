package com.chinkyfamily.demo.Basics_SpringBoot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/getAll")
    List<Student> getStudents() {
        return studentService.getStudents();
    }

    /**
     * Set Content-type: application/json
     * Set Body: raw with JSON
     */
    @PostMapping(path = "/addStudent")
    public ResponseEntity<Student> registerStudent(@RequestBody Student student) {
        return studentService.addNewStudent(student);
    }

    /**
     * Set Content-type: application/text
     * Set Body: raw with Text
     */
    @DeleteMapping(path = "/deleteStudent")
    public ResponseEntity<String> deleteStudent(@RequestBody String email) {
        return studentService.deleteStudent(email);
    }

    /**
     * Set Content-type: application/json
     * Set Body: raw with JSON
     */
    @PutMapping(path = "/updateStudent")
    public ResponseEntity<String> updateStudent(@RequestBody Map<String, String> query) {
        return studentService.updateStudent(query);
    }
}
