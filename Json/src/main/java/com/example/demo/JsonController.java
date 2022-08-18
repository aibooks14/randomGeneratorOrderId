package com.example.demo;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

	@GetMapping("/student")
	public List<Student> getStudent(){
		ArrayList<Student> studentList = new ArrayList<Student>() ;
		
		studentList.add(new Student("sachin", "kumar", "sachinkumar@gmail.com")) ;
		studentList.add(new Student("mohit", "kumar", "Mohitkumar@gmail.com")) ;
		return studentList ;
	}
	
	
}
