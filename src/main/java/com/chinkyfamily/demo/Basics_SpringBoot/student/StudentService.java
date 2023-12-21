package com.chinkyfamily.demo.Basics_SpringBoot.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public ResponseEntity<Student> addNewStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if (studentByEmail.isPresent()) {
            throw new IllegalStateException(student.getEmail() + " is already registered!");
        }
        studentRepository.save(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    public ResponseEntity<String> deleteStudent(String email) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(email);
        if (studentByEmail.isPresent()) {
            studentRepository.delete(studentByEmail.get());
            return new ResponseEntity<>("Record of " + studentByEmail.get().getEmail() + " is deleted successfully!", HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>("Email address: " + email + " is not found in the directory!", HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @Transactional
    ResponseEntity<String> updateStudent(Map<String, String> query) {
        String oldEmail = query.get("oldEmail");
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(oldEmail);
        if (studentByEmail.isPresent()) {
            studentByEmail.get().setName(query.get("name"));
            studentByEmail.get().setEmail(query.get("newEmail"));
            return new ResponseEntity<>("Record of " + oldEmail + " is updated successfully", HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>("Email address: " + oldEmail + " is not found in the directory!", HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
