package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	

	@Query("select u from User u where u.emailid = :emailid")
	public User getuserbyemailid(@Param("emailid") String emailid);
}
