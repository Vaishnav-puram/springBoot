package com.example.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration

public class MyConfig {

    @Bean("s1")
    @Lazy
    public Student  getStudent1(){
        System.out.println("creating student1 object....");
        return new Student("Student1");
    }

    @Bean("s2")
    public Student  getStudent2(){
        System.out.println("creating student2 object....");
        return new Student("Student2");
    }
}
