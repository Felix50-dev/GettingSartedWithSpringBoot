package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student felix = new Student(
                    "Felix Musau",
                    "mwatufelix1@gmail.com",
                    LocalDate.of(2000, JANUARY, 3),
                    23
            );
            Student tony = new Student(
                    "Tony Kimathi",
                    "mwatufelix1@gmail.com",
                    LocalDate.of(1999, JANUARY, 3),
                    23
            );

            repository.saveAll(List.of(felix,tony));
        };
    }
}
