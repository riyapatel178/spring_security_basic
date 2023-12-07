package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.User;

@Service
public interface UserService {
	
	// add new user
	User saveuser(User user);
	
	// get all users
	 List<User> getallusers();
	 
	 //get user by id
	 User getuserbyId(int userid);
	

}
