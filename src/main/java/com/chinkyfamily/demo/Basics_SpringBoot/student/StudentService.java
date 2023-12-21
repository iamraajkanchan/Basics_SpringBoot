package com.chinkyfamily.demo.Basics_SpringBoot.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
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

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if (studentByEmail.isPresent()) {
            throw new IllegalStateException("Student with this email address is already registered!");
        }
        studentRepository.save(student);
    }

    void deleteStudent(String email) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(email);
        if (studentByEmail.isPresent()) {
            studentRepository.delete(studentByEmail.get());
        } else {
            throw new IllegalArgumentException("Email address: " + email + " is not found in the directory!");
        }
    }

    @Transactional
    void updateStudent(Map<String, String> query) {
        String oldEmail = query.get("oldEmail");
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(oldEmail);
        if (studentByEmail.isPresent()) {
            studentByEmail.get().setName(query.get("name"));
            studentByEmail.get().setEmail(query.get("newEmail"));
        } else {
            throw new IllegalArgumentException("Email address: " + oldEmail + " is not found in the directory!");
        }
    }
}
