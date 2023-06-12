package com.example.annotations;

public class Student {
    String name;
    public Student(String student) {
        this.name=student;
    }

    public void studying(){
        System.out.println(name+" "+"studying...");
    }
}
