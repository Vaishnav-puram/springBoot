package com.example.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pack1.Teacher;

@SpringBootApplication
public class AnnotationsApplication implements CommandLineRunner {
	@Autowired
	@Qualifier("s2")
	Student student;
	@Autowired
	Student1 student1;

	@Autowired
	Teacher teacher;
	public static void main(String[] args) {
		SpringApplication.run(AnnotationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		student.studying();
		student1.studying();
		teacher.teaches();
	}
}
