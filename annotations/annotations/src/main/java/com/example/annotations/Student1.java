package com.example.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"pack1"})
public class Student1{
    public void studying(){
        System.out.println("student studying... from component example");
    }
}