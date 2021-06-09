package com.rest.mongo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.mongo.models.Student;
import com.rest.mongo.repo.StudentRepo;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200/")
public class StudentController {
	
	@Autowired
	private StudentRepo stuRepo;

	// get All Students
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return stuRepo.findAll();
	}

	// New Student
	@PostMapping("/student")
	public Student createRegister(@RequestBody Student student) {
		return stuRepo.save(student);
	}
	
	// get Student By Id
	@GetMapping("students/{id}")
	public Optional<Student> getStuById(@PathVariable String id){
		return stuRepo.findById(id);
	}

	//update student by id
	@PutMapping("students/{id}")
	public Student updateStudent(@PathVariable String id,@RequestBody Student student){
		Student stu= stuRepo.findById(id).orElseThrow();
		stu.setRollNo(student.getRollNo());
		stu.setName(student.getName());
		stu.setGender(student.getGender());
		stu.setEmail(student.getEmail());
		stu.setContactNo(student.getContactNo());
		stu.setAddress(student.getAddress());
		
		return stuRepo.save(stu);
	}
	
	//Delete student by id
	@DeleteMapping("students/{id}")
	public String deleteStu(@PathVariable String id){
		Student stu= stuRepo.findById(id).orElseThrow();
		stuRepo.delete(stu);
		if(stu==null) {
			return "No records Found!";
		}
		return "Student Deleted Succesfully";
	}
}
