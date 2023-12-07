package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.User;
import com.demo.service.Userserviceimpl;

@RestController
public class UserController {
	
	@Autowired
	private Userserviceimpl userservice;
	
	@PostMapping("/user")
	public ResponseEntity<User> adduser(@RequestBody User user) {
		try {
		User saveduser = this.userservice.saveuser(user);
		return ResponseEntity.of(Optional.of(saveduser));
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
	}
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getallusers(){
		try {
			List<User> allusers = this.userservice.getallusers();
			return ResponseEntity.of(Optional.of(allusers));
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getuserbyid(@PathVariable("id") int id ){
		try {
			User getuser = this.userservice.getuserbyId(id);
			return ResponseEntity.of(Optional.of(getuser));
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

}
