package com.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.demo.entity.User;
import com.demo.repository.UserRepository;

public class UserDeatilsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository UserRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// fetching user from data base
		
		User user = UserRepository.getuserbyemailid(email);
		if(user==null) {
			throw new UsernameNotFoundException("user cannot found");
		}
		CustomUserDetails CustomUserDetails = new CustomUserDetails(user);
		
		
		return CustomUserDetails;
	}

}
