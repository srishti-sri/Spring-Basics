package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseRepository courseData;
	
	@RequestMapping("/courses")
	public List<Course> retreiveAllCourses(){
		returnOutput();
		return Arrays.asList(new Course(1, "AWS", "Udemy"), new Course(2, "ABC", "Udemy"));
	}
	
	public void returnOutput() {
		System.out.println("dekho na chala");
	}
}
