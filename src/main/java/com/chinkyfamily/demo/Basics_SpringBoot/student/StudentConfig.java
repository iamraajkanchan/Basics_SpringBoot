package com.chinkyfamily.demo.Basics_SpringBoot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student firstStudent = new Student("Mariyam", "mariyam.kazi@gmail.com", LocalDate.of(1993, 9, 13), 30);
            Student secondStudent = new Student("Ivy", "ivy.fernandez@gmail.com", LocalDate.of(1992, 7, 27), 31);
            repository.saveAll(List.of(firstStudent, secondStudent));
        };
    }
}
