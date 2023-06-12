package com.example.actuator.controller;

import com.example.actuator.helper.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Home {

    @Autowired
    Student student;

    @GetMapping("/home")
    public Map<String,String> getData(){
        return Map.of("vaishnav","bangaluru");
    }
}
