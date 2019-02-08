package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	private List<Student> list;

	@PostConstruct
	public void loadData() {
		list = new ArrayList<>();

		list.add(new Student("Chaitanya", "Kumar"));
		list.add(new Student("Kranti", "Kumar"));
		list.add(new Student("Shankar", "Daruga"));
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return list;
	}

	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {

		if (studentId >= list.size() || studentId < 0) {
			throw new StudentNotFoundException("Student id not found - " + studentId);
		}

		return list.get(studentId);
	}

}
