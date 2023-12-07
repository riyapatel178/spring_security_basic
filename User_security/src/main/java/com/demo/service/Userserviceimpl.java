package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.demo.entity.User;
import com.demo.repository.UserRepository;

@Component
public class Userserviceimpl implements UserService {
	
	@Autowired
	private BCryptPasswordEncoder passwordencoder;
	
	@Autowired
	private UserRepository userepo;

	@Override
	public User saveuser(User user) {
		
		user.setRole("ROLE_USER");
		user.setPasswrod(passwordencoder.encode(user.getPasswrod()));
		User saveduser = this.userepo.save(user);
		return saveduser;
	}

	@Override
	public List<User> getallusers() {
		// TODO Auto-generated method stub
		List<User> allusers = this.userepo.findAll();
		return allusers;
	}

	@Override
	public User getuserbyId(int userid) {
		// TODO Auto-generated method stub
		Optional<User> getuser = this.userepo.findById(userid);
		User finduser = getuser.get();
		return finduser;
	}

}
