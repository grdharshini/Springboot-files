package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	private StudentRepository studentRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Student student1 = new Student(1,"Nila","Myaddress1","TNJ","616625");
//		Student student2 = new Student(1,"Sita","Myaddress2","TNJ","614256");
//
//		studentRepository.save(student1);
//		studentRepository.save(student2);
//
//
//	}
}
