package com.rest.mongo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.mongo.models.Register;
import com.rest.mongo.repo.RegisterRepo;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200/")
public class RegisterController {

	@Autowired
	private RegisterRepo regRepo;

	// get All Registered users
	@GetMapping("/users")
	public List<Register> getAllRegUsers() {
		return regRepo.findAll();
	}

	// New Register
	@PostMapping("/user")
	public Register createRegister(@RequestBody Register register) {
		return regRepo.save(register);
	}
}
