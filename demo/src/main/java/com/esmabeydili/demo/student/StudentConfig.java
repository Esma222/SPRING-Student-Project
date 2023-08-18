package com.esmabeydili.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        CommandLineRunner commandLineRunner(StudentRepository repository){    return args -> {

            Student Esma= new Student(
                    "Esma",
                    "esma@gmail.com",
                    LocalDate.of(2002,12,18)
            );
            Student Sema= new Student(
                    "Sema",
                    "sema@gmail.com",
                    LocalDate.of(2000,12,10)
            );

            Student Esra= new Student(
                    "Esra",
                    "esra@gmail.com",
                    LocalDate.of(2004,12,18)
            );
            Student Sera= new Student(
                    "Sera",
                    "sera@gmail.com",
                    LocalDate.of(2003,12,18)
            );
            repository.saveAll(List.of(Esma,Sema,Esra,Sera));
        };
    }

}
